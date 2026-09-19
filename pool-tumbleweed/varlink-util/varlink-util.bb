SUMMARY = "Varlink command line tools"
DESCRIPTION = "This contains command-line tools and vim editor support for varlink."
LICENSE = "MIT"

PV = "24"

RPM_NAME = "varlink-util-24-1.7.aarch64.rpm"
RPM_HASH = "64b2322dbb91a27ca7a1b8ec3fda246572db23ba59ec96951af3820d9edcb75783eac0fef201866d226e2ce6e5f19632558766c05396674e5ad2b53fb799aa2b"

RPROVIDES:${PN} += "varlink-util"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
varlink-vim"

inherit rpm
