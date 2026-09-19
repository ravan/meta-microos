SUMMARY = "Collection of plugins for markdown-it-py"
DESCRIPTION = "Collection of core plugins for markdown-it-py."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python314-mdit-py-plugins-0.6.1-1.2.noarch.rpm"
RPM_HASH = "30fe1f88e9ef3faf50b9263d665e27b93dc751c7506ccd92fd808b9da167a332275e637997b5789be4d7e12eb614928dcb22623509a9285096309fe5677f6750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mdit-py-plugins \
python314-mdit-py-plugins \
python3dist-mdit-py-plugins"

RDEPENDS:${PN} += "python-abi \
python314-markdown-it-py"

inherit rpm
