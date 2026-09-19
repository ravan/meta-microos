SUMMARY = "A pygments lexer for pytest output"
DESCRIPTION = "This library provides a pygments lexer called 'pytest'."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python313-pygments-pytest-2.5.0-1.4.noarch.rpm"
RPM_HASH = "393f7e062af811d8f95a4e82edd62adfbd7f9db9adb525e1d72ca1aa34022353e58590bac1ab89f45f5571e1727180285b32d505d26c9400e979fd8bc75919fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygments-pytest \
python3.13dist-pygments-pytest \
python313-pygments-pytest \
python3dist-pygments-pytest"

RDEPENDS:${PN} += "python-abi \
python313-pygments \
python313-pytest"

inherit rpm
