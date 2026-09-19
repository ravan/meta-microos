SUMMARY = "Distributed quantile sketches"
DESCRIPTION = "Distributed quantile sketches"
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "python313-ddsketch-3.0.1-1.9.noarch.rpm"
RPM_HASH = "de92f7d9c6e5a67aeab61b47945921bf788f07c8051998fb46f72212c0fd2a37ed9711a39ed264ea2a795e36edefc8a42e330495b1fb5e3b46ed769fc2e7d8d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ddsketch \
python3.13dist-ddsketch \
python313-ddsketch \
python3dist-ddsketch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
