SUMMARY = "Powerful figlet replacement"
DESCRIPTION = "TOIlet is in its very early development phase. It uses the powerful libcucul \
library to achieve various text-based effects. TOIlet implements or plans to \
implement the following features: \
 * The ability to load FIGlet fonts \
 * Support for Unicode input and output \
 * Support for colour output \
 * Support for various output formats: HTML, IRC, ANSI... \
 \
TOIlet also aims for full FIGlet compatibility. It is currently able to load \
FIGlet fonts and perform horizontal smushing."
LICENSE = "WTFPL"

PV = "0.3"

RPM_NAME = "toilet-0.3-3.5.aarch64.rpm"
RPM_HASH = "f4d9a677616897c55412049802619947132564ba70ec9cf5cab83571ea63263eb20e24fb6d5da1096879e5fc31e2ea03e404f3501dac84b84db00d4023573ace"

RPROVIDES:${PN} += "toilet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaca.so.0"

inherit rpm
