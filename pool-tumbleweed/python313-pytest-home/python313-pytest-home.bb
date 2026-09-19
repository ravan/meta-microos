SUMMARY = "Home directory fixtures"
DESCRIPTION = "Home directory fixtures"
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-pytest-home-0.6.0-1.4.noarch.rpm"
RPM_HASH = "f6513cc93f1171ccd1d30311f29a292c6ed54d0e6f50818796614f6f50800edfb6ab48208c2aaa18f0fd1998aaeafb90a96f35d38226c56be9bf9844de66d68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-home \
python3.13dist-pytest-home \
python313-pytest-home \
python3dist-pytest-home"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
