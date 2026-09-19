SUMMARY = "Ngspice init scripts"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the ngspice init scripts shared \
between ngspice and libngspice."
LICENSE = "BSD-2-Clause"

PV = "46"

RPM_NAME = "ngspice-scripts-46-1.2.aarch64.rpm"
RPM_HASH = "24e251bf0164e28eca6716abc000f78e9e53a0d7d647a052e721b097c907673bb12071a3336374093cfc2da67c2c3a746151d23bd3128743a87b45730fdd1009"

RPROVIDES:${PN} += "ngspice-scripts"

RDEPENDS:${PN} += ""

inherit rpm
