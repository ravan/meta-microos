SUMMARY = "xSGE Particles"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides particle effects for SGE."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "python314-xsge_particle-1.0.1-2.5.noarch.rpm"
RPM_HASH = "ac38ad9b80d596ea1d366f6b727c2d47da64fde9fa549134aa8bdcc5e71a752686ebe1fc4db48343b65456bebc54476129bdecb3188a4be6f904f892c01b1bd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xsge-particle \
python314-xsge-particle \
python3dist-xsge-particle"

RDEPENDS:${PN} += "python-abi \
python314-sge-pygame \
python314-six"

inherit rpm
