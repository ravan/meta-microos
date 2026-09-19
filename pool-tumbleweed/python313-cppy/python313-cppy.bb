SUMMARY = "C++ headers for C extension development"
DESCRIPTION = "C++ headers for C extension development"
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "python313-cppy-1.3.1-1.5.noarch.rpm"
RPM_HASH = "12bb2bb717fc46f244a29a70bc422e2bfdea4bd071176d1d265effc50d84fb5f825048983e2e4e5ad04f9b1e68e942818cc33a4331b890fd07b8f900e9b4d1ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cppy \
python3.13dist-cppy \
python313-cppy \
python3dist-cppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
