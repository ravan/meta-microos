SUMMARY = "League Of Movable Type's 'Ostrich Sans' font family"
DESCRIPTION = "A modern sans-serif with a very long neck. A number of styles and \
weights are included: dashed (thin), rounded (medium), ultra light, \
normal, bold (race track style double lines) and Black10."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-ostrichsans-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "f2888d00a3a31ed29c8385a1dfeedbe6bdf12f8e30ccb70df131ef932029b73bab3045153ed96bf643a9115f032a583e3bffca197ba829d877e1da297f1787d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-ostrichsans-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
