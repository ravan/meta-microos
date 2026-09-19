SUMMARY = "xSGE GUI Toolkit"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a toolkit for adding GUIs to a SGE game \
as well as support for modal dialog boxes."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "python313-xsge_gui-2.0-1.12.noarch.rpm"
RPM_HASH = "2f670a5a68b7a8578fcec3c8d11718b8d4ad0c54bc6fd98d3c708c9eb3e51a028e0c6213c4597fc856952e7c9b6749eaeb8da248292df118d98f08de763e0f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-gui \
python3.13dist-xsge-gui \
python313-xsge-gui \
python3dist-xsge-gui"

RDEPENDS:${PN} += "python-abi \
python313-sge-pygame \
python313-six"

inherit rpm
