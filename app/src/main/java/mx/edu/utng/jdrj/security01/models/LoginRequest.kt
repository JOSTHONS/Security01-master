// LoginRequest.kt
package mx.edu.utng.jdrj.security01.models

/**
 * Datos necesarios para hacer login
 * Esta información se enviará al servidor
 */
data class LoginRequest(
    val email: String,
    val password: String
)
