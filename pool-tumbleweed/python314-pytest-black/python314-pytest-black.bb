SUMMARY = "Black format checking plugin for pytest"
DESCRIPTION = "A pytest plugin to enable format checking with black."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-pytest-black-0.6.0-2.4.noarch.rpm"
RPM_HASH = "3fca5293b39266c1fac11317f3191260e97bfff57df0e5ee5bba970416897fe833fd152c734bb20f209db7b99ffa48893bdc39d55961497801c464d07ab30ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-black \
python314-pytest-black \
python3dist-pytest-black"

RDEPENDS:${PN} += "python-abi \
python314-black \
python314-pytest \
python314-toml"

inherit rpm
