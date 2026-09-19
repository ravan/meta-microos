SUMMARY = "A high-level constraint modelling language"
DESCRIPTION = "MiniZinc is a free and open-source constraint modeling language."
LICENSE = "MPL-2.0"

PV = "2.9.3"

RPM_NAME = "libminizinc-devel-2.9.3-1.1.aarch64.rpm"
RPM_HASH = "024338245836ff53f2ee61097b177b150b995565fd558359d6dcce1bdb409542a20ea45483b286587e86c3d5b385aac82e9f0dc2def34189467cc74ce16d4824"

RPROVIDES:${PN} += "cmake-libminizinc \
libminizinc-devel"

RDEPENDS:${PN} += "minizinc"

inherit rpm
