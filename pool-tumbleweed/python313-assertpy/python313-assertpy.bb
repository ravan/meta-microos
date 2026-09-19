SUMMARY = "Simple assertion library for unit testing in python with a fluent API"
DESCRIPTION = "Simple assertion library for unit testing in python with a fluent API"
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python313-assertpy-1.1-1.4.noarch.rpm"
RPM_HASH = "6a1baed0d59b6723d7ca4f63d6e9848a2a5a6faacace43188e1cd97e5f54151666b9c03069eb87bcdc86a7eb52be078c21414f5f7eb972b6c72f1dd355cec4ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-assertpy \
python3.13dist-assertpy \
python313-assertpy \
python3dist-assertpy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
