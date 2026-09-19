SUMMARY = "xSGE Path"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides paths for the SGE.  Paths are used to make \
objects move in a certain way."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python313-xsge_path-1.0.3-2.5.noarch.rpm"
RPM_HASH = "aa63d68e1217a021257b239aba7eda7843896429257d02fe1432518d000bcceb964ba97fc74ee13bb7863425d7ad6f2d802cb3153c9dd5e28e1669dc723f573c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-path \
python3.13dist-xsge-path \
python313-xsge-path \
python3dist-xsge-path"

RDEPENDS:${PN} += "python-abi \
python313-sge-pygame"

inherit rpm
