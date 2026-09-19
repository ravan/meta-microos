SUMMARY = "Header files for fifechan"
DESCRIPTION = "Development files, such as headers, needed when building packages using fifechan."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "fifechan-devel-0.1.5-1.28.aarch64.rpm"
RPM_HASH = "55926d84bfdad3c245e4d69073a6506176664621a43b82a4c38cb372d81defbb69de8e638fc31a746fc63200813d8b0e78f400e744c749b754424ff75f4c8b23"

RPROVIDES:${PN} += "fifechan-devel"

RDEPENDS:${PN} += "libfifechan-opengl0-1-5 \
libfifechan-sdl0-1-5 \
libfifechan0-1-5"

inherit rpm
