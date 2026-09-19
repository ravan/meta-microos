SUMMARY = "xSGE Physics Framework"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a framework for collision physics. \
This can be useful for platformers."
LICENSE = "LGPL-3.0-or-later"

PV = "0.13.3"

RPM_NAME = "python313-xsge_physics-0.13.3-2.12.noarch.rpm"
RPM_HASH = "45f95f879620e1955afe28ff29e99d091630172434f5e3867402460ab729ce421e08ef229298a48cdd8a94364ae3013cc1c5974a9a13c3424afeb50cbe04582c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-physics \
python3.13dist-xsge-physics \
python313-xsge-physics \
python3dist-xsge-physics"

RDEPENDS:${PN} += "python-abi \
python313-sge-pygame"

inherit rpm
