package oops

sealed class MusicState{


    data class Play( val name: String, val position: Int):MusicState()
    data class Pause( val name: String): MusicState()
    object Stop: MusicState()



}

fun handleState(state: MusicState){
    when(state){
        is MusicState.Play -> println("Playing ${state.name} at ${state.position}sec")
        is MusicState.Pause -> println("Paused on ${state.name}")
        is MusicState.Stop -> println("Song is stopped!")
    }
//yaha else lagane ki jarut nhi hai, essiliye compiler error nhi de rha qki esse pata hai etne hi options hai

}


fun main(){

    val s1 = MusicState.Play("shape of you", 42)
    val s2 = MusicState.Pause("Perfect")
    val s3 = MusicState.Stop

    handleState(s1)
    handleState(s2)
    handleState(s3)

}


