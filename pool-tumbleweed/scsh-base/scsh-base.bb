SUMMARY = "A Unix shell embedded within Scheme"
DESCRIPTION = "Scsh is a Unix shell embedded in Scheme. It allows the user to write \
commands in a language within Scheme that follows the Unix way, but \
also allows to specify more complex commands with the elegance of \
Scheme."
LICENSE = "BSD-3-Clause"

PV = "0.7+git6770db21b08edd907d1c9bd962297ff55664e3fe"

RPM_NAME = "scsh-base-0.7+git6770db21b08edd907d1c9bd962297ff55664e3fe-2.4.aarch64.rpm"
RPM_HASH = "2c4b50c5d2144f7c3968bc57888dc46d34646611cf98b7c4c5d22fb84763a511e4faca82bd6a66940b9e07d87fd101ebe8f181d552c24bf4845fee2ac1f0a743"

RPROVIDES:${PN} += "scsh-base"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
scheme48-vm"

inherit rpm
