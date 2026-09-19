SUMMARY = "Plasma library and runtime components"
DESCRIPTION = "Plasma library and runtime components based upon KF6 and Qt6"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libplasma6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "1ce901bf12bc0bbab7ba5f36b131263f148759acd63e6ae7087338e14254ea7aedcccc9818ab9cef4618493ba1f391cf856989b65cdcc0a085f275cfdd7d6854"

RPROVIDES:${PN} += "cmake-Plasma \
cmake-PlasmaQuick \
libplasma6-devel \
plasma6-framework-devel"

RDEPENDS:${PN} += "cmake-KF6Kirigami \
cmake-KF6Package \
cmake-KF6WindowSystem \
cmake-Qt6Gui \
cmake-Qt6Quick \
libPlasma7 \
plasma6-framework \
plasma6-framework-components"

inherit rpm
