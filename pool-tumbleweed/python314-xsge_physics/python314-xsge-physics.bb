SUMMARY = "xSGE Physics Framework"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a framework for collision physics. \
This can be useful for platformers."
LICENSE = "LGPL-3.0-or-later"

PV = "0.13.3"

RPM_NAME = "python314-xsge_physics-0.13.3-2.12.noarch.rpm"
RPM_HASH = "fdcca03916e3ff53fffa7c10db7fa2e78ea48227c1e8ef537ed6153adefc502313b23dde7b50b53c65d7a9ae6d0b6711f21ea425e0866dbf33eb71194ddebc74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xsge-physics \
python314-xsge-physics \
python3dist-xsge-physics"

RDEPENDS:${PN} += "python-abi \
python314-sge-pygame"

inherit rpm
