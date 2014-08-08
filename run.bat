@ECHO OFF
IF EXIST java (
	start "BILS NRS" java -cp bils.jar;lib\*;conf nxt.Nxt
) ELSE (
	IF EXIST "%PROGRAMFILES%\Java\jre7" (
		start "BILS NRS" "%PROGRAMFILES%\Java\jre7\bin\java.exe" -cp bils.jar;lib\*;conf nxt.Nxt
	) ELSE (
		IF EXIST "%PROGRAMFILES(X86)%\Java\jre7" (
			start "BILS NRS" "%PROGRAMFILES(X86)%\Java\jre7\bin\java.exe" -cp bils.jar;lib\*;conf nxt.Nxt
		) ELSE (
			ECHO Java software not found on your system. Please go to http://java.com/en/ to download a copy of Java.
			PAUSE
		)
	)
)

