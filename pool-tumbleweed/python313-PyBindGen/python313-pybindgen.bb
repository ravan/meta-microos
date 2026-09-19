SUMMARY = "Python Bindings Generator"
DESCRIPTION = "A tool to generate Python bindings for C/C++ code."
LICENSE = "LGPL-2.1-only"

PV = "0.22.1"

RPM_NAME = "python313-PyBindGen-0.22.1-2.6.noarch.rpm"
RPM_HASH = "6d6d9765375166bacb6c044d436cd6ee2b4dd66c6d4a4c796adba278ea8e88c52001070a57401ef360d05e04a4d5352f3d6c937dbdbf5dab7a65738d71ef349a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyBindGen \
python3.13dist-pybindgen \
python313-PyBindGen \
python3dist-pybindgen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
