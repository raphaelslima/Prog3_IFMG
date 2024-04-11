import javax.tools.ToolProvider;

public class PostLifetime {
    long totalAlcance;
    long totalImpressoes;
    long engajadosUsuarios;
    long clientes;
    long consumo;
    long impressoesPorLike;
    long alcancePorLike;
    long engajadosLike;

    public void Lifetime(long totalAlcance, long totalImpressoes, long engajadosUsuarios, long clientes, long consumo,
            long impressoesPorLike, long alcancePorLike, long engajadosLike) {
        this.totalAlcance = totalAlcance;
        this.totalImpressoes = totalImpressoes;
        this.engajadosUsuarios = engajadosUsuarios;
        this.clientes = clientes;
        this.consumo = consumo;
        this.impressoesPorLike = impressoesPorLike;
        this.alcancePorLike = alcancePorLike;
        this.engajadosLike = engajadosLike;
    }

    public long getTotalAlcance() {
        return totalAlcance;
    }

    public long getTotalImpressoes() {
        return totalImpressoes;
    }

    public long getEngajadosUsuarios() {
        return engajadosUsuarios;
    }

    public long getClientes() {
        return clientes;
    }

    public long getConsumo() {
        return consumo;
    }

    public long getImpressoesPorLike() {
        return impressoesPorLike;
    }

    public long getAlcancePorLike() {
        return alcancePorLike;
    }

    public long getEngajadosLike() {
        return engajadosLike;
    }

    public void setTotalAlcance(long totalAlcance) {
        this.totalAlcance = totalAlcance;
    }

    public void setTotalImpressoes(long totalImpressoes) {
        this.totalImpressoes = totalImpressoes;
    }

    public void setEngajadosUsuarios(long engajadosUsuarios) {
        this.engajadosUsuarios = engajadosUsuarios;
    }

    public void setClientes(long clientes) {
        this.clientes = clientes;
    }

    public void setConsumo(long consumo) {
        this.consumo = consumo;
    }

    public void setImpressoesPorLike(long impressoesPorLike) {
        this.impressoesPorLike = impressoesPorLike;
    }

    public void setAlcancePorLike(long alcancePorLike) {
        this.alcancePorLike = alcancePorLike;
    }

    public void setEngajadosLike(long engajadosLike) {
        this.engajadosLike = engajadosLike;
    }

    // imprime tudo;
    /**
     * como que resolve conflitos??
     */
    public void imprimeTudo() {
        System.out.println("Impressões totais: " + totalImpressoes);
        System.out.println("Quantidade de usuários engajados: " + engajadosUsuarios);
        System.out.println("Total de clientes: " + clientes);
        System.out.println("Total de consumo: " + consumo);
        System.out.println("Impressões por likes: " + impressoesPorLike);
        System.out.println("Alcance por likes: " + alcancePorLike);
        System.out.println("Total de engajados e com likes: " + engajadosLike);
    }
}
