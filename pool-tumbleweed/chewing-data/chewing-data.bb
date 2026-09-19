SUMMARY = "Data for libchewing"
DESCRIPTION = "This package contains data files for libchewing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "chewing-data-0.12.0-1.4.noarch.rpm"
RPM_HASH = "ca7acde5e80cd511bd681af73a65a5cf7072237b106f5f7d68f6c023c6b6c2bef2112e1bcf9c3aeae87561b3b9b83759c735d533d7af6f017a0dc787e2d2d0b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chewing-data"

RDEPENDS:${PN} += ""

inherit rpm
