SUMMARY = "xSGE Lighting Library"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides an interface for lighting."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python314-xsge_lighting-1.0.3-2.10.noarch.rpm"
RPM_HASH = "3a83a5918fda33818e56d422eb6c244bb751b8374b4a203d24d969fcf1257a49e648889002ee856fe31abf9a469afbba9ae5bbdfe2cfc28e11c5d5151f32025e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xsge-lighting \
python314-xsge-lighting \
python3dist-xsge-lighting"

RDEPENDS:${PN} += "python-abi \
python314-sge-pygame"

inherit rpm
