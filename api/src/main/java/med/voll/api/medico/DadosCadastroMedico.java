package med.voll.api.medico;

import med.voll.api.enderco.DadosEndereco;

/*classe imutavel*/
public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
