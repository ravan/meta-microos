SUMMARY = "A TOTP code generator for your terminal"
DESCRIPTION = "termotp reads an encrypted vault export from your TOTP Android App (currently, only Aegis Authenticator is supported) and displays issuers, providers and a TOTP for each of them. The program uses no database and reads directly from the App export. Since backups are encrypted, your credentials never stay on the disk unencrypted. It's basically a pure terminal based way to generate TOTP tokens while keeping your credentials encrypted."
LICENSE = "Apache-2.0"

PV = "0.0.11"

RPM_NAME = "termotp-0.0.11-1.11.aarch64.rpm"
RPM_HASH = "d91e128626bb1ab20a493474270ef12648abb197b6c054bcfff9806ade53b239a3a6064f1eaa5fa984167b747ec5309980074386372f38cb1a4dea6421bc3142"

RPROVIDES:${PN} += "termotp"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
