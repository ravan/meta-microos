SUMMARY = "GAP: Brauer tables of spin-symmetric groups"
DESCRIPTION = "This package contains Brauer tables of Schur covers of symmetric and \
alternating groups, and provides some related functionalities."
LICENSE = "GPL-2.0+"

PV = "1.5.2"

RPM_NAME = "gap-spinsym-1.5.2-1.9.noarch.rpm"
RPM_HASH = "157ddcca6c971f73569e6104b168039616b12013e34dd013e8d82bd8a202afadaca41e45e10eebc158b8241c4d1793bb0d49a738726431d2cdc04dc152d931c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-spinsym"

RDEPENDS:${PN} += "gap-core \
gap-ctbllib \
gap-gapdoc"

inherit rpm
