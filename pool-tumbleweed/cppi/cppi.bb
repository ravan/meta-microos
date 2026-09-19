SUMMARY = "C preprocessor directive indenter"
DESCRIPTION = "cppi indents the C preprocessor directives to reflect their nesting and ensures \
that there is exactly one space character between each #if, #elif, #define \
directive and the following token."
LICENSE = "GPL-3.0+"

PV = "1.18"

RPM_NAME = "cppi-1.18-2.35.aarch64.rpm"
RPM_HASH = "b71faeaf65dd41e5a64558511ab248445886e50beafc0265ce12ecb9676fdd3d7ac3718337426fb0fb7fa9637f0691b48f38c001102149368169b10f3201577c"

RPROVIDES:${PN} += "cppi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
