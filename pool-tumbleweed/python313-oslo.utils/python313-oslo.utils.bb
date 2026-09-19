SUMMARY = "OpenStack Utils Library"
DESCRIPTION = "The oslo.utils library provides support for common utility type functions, \
such as encoding, exception handling, string manipulation, and time handling."
LICENSE = "Apache-2.0"

PV = "10.2.0"

RPM_NAME = "python313-oslo.utils-10.2.0-1.1.noarch.rpm"
RPM_HASH = "aa67ab72c6b9fcf228218ec187a0d56f057fa40fb38128375c16694c5540f427f3e3b66eecf07185a947f4ed1fde73c2fc23007546d2d0c19494b1c592eb97a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.utils \
python3.13dist-oslo.utils \
python313-oslo.utils \
python3dist-oslo.utils"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-debtcollector \
python313-iso8601 \
python313-netaddr \
python313-oslo.i18n \
python313-psutil \
python313-pyparsing \
python313-tzdata"

inherit rpm
