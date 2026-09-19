SUMMARY = "Plugin for pytest to simplify calling ansible modules from tests or fixtures"
DESCRIPTION = "Plugin for pytest to simplify calling ansible modules from tests or fixtures"
LICENSE = "MIT"

PV = "26.6.0"

RPM_NAME = "python3-pytest-ansible-26.6.0-1.2.noarch.rpm"
RPM_HASH = "7d2c81cd652c5ade6d907c187ca7bb5e04d40de988a04f873e8ca81549f9529457bcdab6bef31b7fd5e958efe4a492c728c3a5cf1ecdc532ff4604993e13847a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-ansible \
python3.13dist-pytest-ansible \
python3dist-pytest-ansible"

RDEPENDS:${PN} += "ansible-core \
python-abi \
python3-ansible-compat \
python3-cffi \
python3-packaging \
python3-pytest \
python3-pytest-xdist \
python3-typing-extensions"

inherit rpm
