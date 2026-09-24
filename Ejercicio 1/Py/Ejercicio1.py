try:
    # Solicitar la edad al usuario y convertirla a número entero
    edad = int(input("Por favor, ingresa tu edad: "))

    # Verificar que la edad no sea un número negativo
    if edad < 0:
        print("Por favor, ingresa una edad válida.")
    else:
        # Clasificar al usuario según los rangos de edad establecidos
        if edad < 13:
            print("Eres un niño.")
        elif edad <= 17:  # Python evalúa en orden, si llega aquí ya sabemos que es mayor o igual a 13
            print("Eres un adolescente.")
        elif edad <= 64:  # Si llega aquí, ya sabemos que es mayor o igual a 18
            print("Eres un adulto.")
        else:
            print("Eres un adulto mayor.")

except ValueError:
    # Capturar el error en caso de que el usuario no ingrese un número entero
    print("Error: Debes ingresar un número entero.")
# Fin