SUMMARY = "A ligatured font for the Old Hungarian script"
DESCRIPTION = "Kende is a ligatured font for the Old Hungarian script."
LICENSE = "OFL-1.1"

PV = "20230908"

RPM_NAME = "rovasiras-kende-fonts-20230908-1.9.noarch.rpm"
RPM_HASH = "0474289c128f724fe6592d131ff3ab8cb302762fe0556b86b5997d88d61b3b5d265ac8b607854163dcd098aa7c42e01336dfab9841a7add2331b75cc44a27a65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rovasiras-kende-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
