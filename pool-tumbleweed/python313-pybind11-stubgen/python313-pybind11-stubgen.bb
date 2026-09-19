SUMMARY = "PEP 561 type stubs generator for pybind11 modules"
DESCRIPTION = "Generate stubs for python modules.  There are several tweaks to target \
specifically modules compiled using pybind11"
LICENSE = "BSD-3-Clause"

PV = "2.5.5"

RPM_NAME = "python313-pybind11-stubgen-2.5.5-1.5.noarch.rpm"
RPM_HASH = "aac0976bf528281ac8702e0cfffec86eba9b20f292467ff2d39ebdbc17f6e4c3b63a9384edeb3dd769e85ba44d41705f0654e1eb117795ea9466450bb752ffe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybind11-stubgen \
python3.13dist-pybind11-stubgen \
python313-pybind11-stubgen \
python3dist-pybind11-stubgen"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
