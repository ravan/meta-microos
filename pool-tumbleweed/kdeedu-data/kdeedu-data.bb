SUMMARY = "Data files for KDE Education Applications"
DESCRIPTION = "This package contains common data files used by various KDE education \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdeedu-data-26.08.1-1.1.noarch.rpm"
RPM_HASH = "ef04df545cb69a35c2fdb2ebbf25efe3b6758b071b8e505a660d48a08ad767df963c47883e144bc22ecf16d01c9bfd2c1a8e89c717672638d9b92dbb67bfd888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeedu-data \
libkdeedu4-data \
libkeduvocdocument-data"

RDEPENDS:${PN} += ""

inherit rpm
