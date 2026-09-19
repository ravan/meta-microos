SUMMARY = "Command line utility to convert Int. Domain Names"
DESCRIPTION = "An implementation of the IDNA2008 specifications (RFCs 5890, 5891, 5892, 5893)"
LICENSE = "GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "libidn2-tools-2.3.8-1.5.aarch64.rpm"
RPM_HASH = "3d0c5afd902c9101dca315398c3d6984cca6e05476ed715227cb3168d04849aa9c482808dcd8ff0e135c68c4b69863953ded2711bef09711e3908e40b9c06eaf"

RPROVIDES:${PN} += "libidn2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn2.so.0 \
libunistring.so.5"

inherit rpm
