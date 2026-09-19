SUMMARY = "Data files for projectM"
DESCRIPTION = "projectM is a music visualizer. \
This package contains its data: config, presets, shaders."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "projectM-data-3.1.12-4.7.aarch64.rpm"
RPM_HASH = "6a5c6247e441a662be8a3333bb14fa534ab51ff35db34caac0eab45c3ffa6eed849afff58d5677956cb8c1f74bee580e83c6497f4ecd8b60647c5dc9f00e64a8"

RPROVIDES:${PN} += "projectM-data \
projectM-qt5-data"

RDEPENDS:${PN} += "dejavu \
projectM"

inherit rpm
