SUMMARY = "xSGE GUI Toolkit"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a toolkit for adding GUIs to a SGE game \
as well as support for modal dialog boxes."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "python314-xsge_gui-2.0-1.12.noarch.rpm"
RPM_HASH = "3406dd713ae86549040fec3fd2355d87682cd2a87a30aa79e07f1540b159589f7a3d7ee72cedc9fdea5f7f7ae544bdc39bcbeb4666079aa1baafd67bb04ce85d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xsge-gui \
python314-xsge-gui \
python3dist-xsge-gui"

RDEPENDS:${PN} += "python-abi \
python314-sge-pygame \
python314-six"

inherit rpm
