SUMMARY = "Design of experiments for Python"
DESCRIPTION = "The pyDOE2 package is a fork of the pyDOE package that is designed to \
help the scientist, engineer, statistician, etc., to construct \
appropriate experimental designs. \
 \
This fork came to life to solve bugs and issues that remained unsolved in the \
original package."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python313-pyDOE2-1.3.0-3.5.noarch.rpm"
RPM_HASH = "8e93ade3eae0dba89a26a0af8ff5545b34028c5b11a332ef8102433f60e8c0fe52064253bedb85e07413022a63f72a1455553231dcd7f57bec86618ecda09513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyDOE2 \
python3.13dist-pydoe2 \
python313-pyDOE2 \
python3dist-pydoe2"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-scipy"

inherit rpm
