SUMMARY = "Common files used by libayatana-indicator"
DESCRIPTION = "This library contains information to build indicators to go into \
the indicator applet. \
 \
This package contains common files."
LICENSE = "GPL-3.0-only"

PV = "0.9.4"

RPM_NAME = "ayatana-indicator3-7-common-0.9.4-2.4.noarch.rpm"
RPM_HASH = "28a531032f455546683f93c8ab55fb8aaa2782a9283ec6c2510e16ded6bf21f68c94d8d5922edf6325a8dfe577f42123a600ef2368458827e6519f62dd459c77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ayatana-indicator3-7-common"

RDEPENDS:${PN} += ""

inherit rpm
