SUMMARY = "Generic map viewer: Build Environment"
DESCRIPTION = "Development headers and libraries for Marble."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "marble-devel-26.08.1-1.2.aarch64.rpm"
RPM_HASH = "310fbae4cbaf02dc25ae5fa7d998caab04c138836fd60496576feb15d13c826303feb378cdcfec257d4c7effc3e55b4f7dd1f2f35dc1a7223356d0a534251a88"

RPROVIDES:${PN} += "cmake-Astro \
cmake-Marble \
marble-devel \
marble5-devel"

RDEPENDS:${PN} += "cmake-Qt6Core5Compat \
cmake-Qt6WebEngineWidgets \
cmake-Qt6Widgets \
cmake-Qt6Xml \
libastro1 \
libmarblewidget-qt6-28"

inherit rpm
