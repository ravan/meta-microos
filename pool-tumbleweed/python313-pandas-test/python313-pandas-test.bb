SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-test-3.0.5-2.2.noarch.rpm"
RPM_HASH = "42f7f52b3c84d8662af3f0ccaf981d56d6c848280f3d8aa53d4804f90480a8c85a95d6ae8ac7a250adcf1be469574f55230e9db9524da39efd7e8d1d57e418b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-test \
python313-pandas-test"

RDEPENDS:${PN} += "python313-hypothesis \
python313-pandas \
python313-pytest \
python313-pytest-xdist"

inherit rpm
