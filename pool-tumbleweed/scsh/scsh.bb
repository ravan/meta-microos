SUMMARY = "A Unix shell embedded within Scheme"
DESCRIPTION = "Scsh is a Unix shell embedded in Scheme. It allows the user to write \
commands in a language within Scheme that follows the Unix way, but \
also allows to specify more complex commands with the elegance of \
Scheme."
LICENSE = "BSD-3-Clause"

PV = "0.7+git6770db21b08edd907d1c9bd962297ff55664e3fe"

RPM_NAME = "scsh-0.7+git6770db21b08edd907d1c9bd962297ff55664e3fe-2.6.aarch64.rpm"
RPM_HASH = "3f964ce17786fc9d863dd97276a9727a882d1c2b585e71b7b3199b962dae46c3764d9b730c122d2b8b455a3480d003b9edc3bdc902c717d97810de89284db7d3"

RPROVIDES:${PN} += "scsh"

RDEPENDS:${PN} += "libc.so.6 \
scheme48-vm \
scsh-base"

inherit rpm
