classDiagram
    class Iphone
    class MusicaRepository
    class ContatoRepository
    class NavegadorRepository

    Iphone : - musicaRepository: MusicaRepository
    Iphone : - contatoRepository: ContatoRepository
    Iphone : - navegadorRepository: NavegadorRepository

    Iphone ..|> MusicaRepository
    Iphone ..|> ContatoRepository
    Iphone ..|> NavegadorRepository