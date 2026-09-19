SUMMARY = "xSGE Lighting Library"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides an interface for lighting."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python313-xsge_lighting-1.0.3-2.10.noarch.rpm"
RPM_HASH = "a5f4b4e9d32c357c9963b376f36ebfc6ae7a19703ee438429ee91a4ad1704d0133ae5628cabe302d3f04a58129acbc1e8f13870129f7e3796ec8493fd65bec98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-lighting \
python3.13dist-xsge-lighting \
python313-xsge-lighting \
python3dist-xsge-lighting"

RDEPENDS:${PN} += "python-abi \
python313-sge-pygame"

inherit rpm
