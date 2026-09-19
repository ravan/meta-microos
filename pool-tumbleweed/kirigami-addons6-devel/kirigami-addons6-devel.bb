SUMMARY = "Development files for kirigami-addons6"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma). This package provides development files to build \
applications with kirigami-addons."
LICENSE = "LGPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "kirigami-addons6-devel-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "64849aa45f9e319ef3bc551f6e277a0eea68c70400f89beba5ad2cf0ef27ede28c3ec017ed07aa29a8a5ca1cf7430cab4edaed6b47e84fcd6a2ed63778d540c1"

RPROVIDES:${PN} += "cmake-KF6KirigamiAddons \
kirigami-addons6-devel"

RDEPENDS:${PN} += "kirigami-addons6 \
libKirigamiAddonsComponents6 \
libKirigamiAddonsStatefulApp6 \
libKirigamiApp6"

inherit rpm
