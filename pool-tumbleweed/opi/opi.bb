SUMMARY = "OBS Package Installer (CLI)"
DESCRIPTION = "OBS Package Installer (CLI) \
Search and install almost all packages available for openSUSE and SLE: \
- openSUSE Build Service \
- Packman \
- Popular packages for 3rd party vendors"
LICENSE = "GPL-3.0-only"

PV = "5.16.0"

RPM_NAME = "opi-5.16.0-1.1.noarch.rpm"
RPM_HASH = "68efb311be9c33f8bb5a13886299f01d1dc99afbe2de70025f51571c805188d376d32d86976b65b5ae51b39d9d8d831e46dfd3b609ca760c8e4aed38ee466a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-opi \
opi \
python3.13dist-opi \
python3dist-opi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
curl \
python-abi \
python3-curses \
python3-lxml \
python3-requests \
python3-rpm \
python3-termcolor \
sudo \
zypper"

inherit rpm
