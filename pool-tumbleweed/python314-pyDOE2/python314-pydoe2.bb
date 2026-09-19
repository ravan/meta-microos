SUMMARY = "Design of experiments for Python"
DESCRIPTION = "The pyDOE2 package is a fork of the pyDOE package that is designed to \
help the scientist, engineer, statistician, etc., to construct \
appropriate experimental designs. \
 \
This fork came to life to solve bugs and issues that remained unsolved in the \
original package."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python314-pyDOE2-1.3.0-3.5.noarch.rpm"
RPM_HASH = "d72ff419e3ff929f587f34b7a2d33e56e2c49d746ed11637fa7e8b525dc43df5c5a80a97dddc6211b15d82eec43db71036c1f0026aed3d6b0e734c5fb709d271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydoe2 \
python314-pyDOE2 \
python3dist-pydoe2"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-scipy"

inherit rpm
