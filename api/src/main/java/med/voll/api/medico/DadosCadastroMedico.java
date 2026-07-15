package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.enderco.DadosEndereco;

/*classe imutavel*/
public record DadosCadastroMedico(
        //@NotNull bean validation, nome nao pode ser nulo
        @NotBlank //verifica se nao é vazio e nem nulo (dispensando o @NotNull)
        String nome,

        @NotBlank
        @Email //valida o email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //verifica se o crm tem de 4 a 6 digitos
        String crm,

        @NotNull //nao é @NotBlank porque nao é uma string
        Especialidade especialidade,

        @NotNull @Valid DadosEndereco endereco) {
}
