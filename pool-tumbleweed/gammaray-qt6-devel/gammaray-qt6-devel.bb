SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "Gamma Ray is a comprehensive collection of high level introspection \
and debugging utilities specifically tailored for the various \
frameworks in Qt. Development files."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.0"

RPM_NAME = "gammaray-qt6-devel-3.4.0-1.7.aarch64.rpm"
RPM_HASH = "21667ba02e6939e077b90947f6b9d134a12c8374875355614457d9b61e174481abbdfbfc34019280c25493adcc704ecf094319ea7e5657c798b0663ec3f08b7f"

RPROVIDES:${PN} += "cmake-GammaRay \
gammaray-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Network \
cmake-Qt6Widgets"

inherit rpm
