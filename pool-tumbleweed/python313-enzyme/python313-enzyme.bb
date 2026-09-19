SUMMARY = "Python video metadata parser"
DESCRIPTION = "Enzyme is a Python module to parse video metadata."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python313-enzyme-0.5.2-1.9.noarch.rpm"
RPM_HASH = "c775d93222bb6eca8c2a0ec5b7090cfeb555aab77bbd36134054075952871d54ee4de3930f5407196fb7c31be4218445ea8551058bd6227321472cf6553712dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-enzyme \
python3.13dist-enzyme \
python313-enzyme \
python3dist-enzyme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
