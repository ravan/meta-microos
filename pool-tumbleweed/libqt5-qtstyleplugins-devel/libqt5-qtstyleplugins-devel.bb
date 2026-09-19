SUMMARY = "Qt 5 Style Plugins Development Files"
DESCRIPTION = "You need this package, if you want to compile programs with qtstyleplugins."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.0.0+git20170311"

RPM_NAME = "libqt5-qtstyleplugins-devel-5.0.0+git20170311-10.34.aarch64.rpm"
RPM_HASH = "dfe219bf219b1d70274c232f1df0bc807900800713c6cba722d56a3d9ba5466375e4c62c4e10b21ece614fe2815a9f3f34dd4bc5b15c75611140692aa70aed9b"

RPROVIDES:${PN} += "libqt5-qtstyleplugins-devel"

RDEPENDS:${PN} += "libqt5-qtstyleplugins \
libqt5-qtstyleplugins-platformtheme-gtk2"

inherit rpm
