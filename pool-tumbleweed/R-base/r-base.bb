SUMMARY = "R - statistics package (S-Plus like)"
DESCRIPTION = "R is a language which is not entirely unlike the S language developed at \
AT&T Bell Laboratories by Rick Becker, John Chambers and Allan Wilks."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-base-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "594328a0c80eb9ac253b86cf27f456bc17962b79f31f281adadf2a00db3365cdbdfeb62d69a1d0120411c4af01586d3c1659de84c03a35f855870aa13ec93f4d"

RPROVIDES:${PN} += "R \
R-base"

RDEPENDS:${PN} += "R-base-devel \
R-core \
R-core-devel \
R-core-doc \
R-core-libs \
R-core-packages \
R-recommended-packages \
fontconfig \
glibc-locale \
make \
xdg-utils \
xorg-x11-fonts-100dpi \
xorg-x11-fonts-75dpi"

inherit rpm
