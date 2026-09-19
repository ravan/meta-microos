SUMMARY = "Command-line client for the Open Build Service"
DESCRIPTION = "openSUSE Commander is a command-line client for the Open Build Service. \
 \
See http://en.opensuse.org/openSUSE:OSC, as well as \
http://en.opensuse.org/openSUSE:Build_Service_Tutorial \
for a general introduction."
LICENSE = "GPL-2.0-or-later"

PV = "1.27.3"

RPM_NAME = "osc-1.27.3-1.1.noarch.rpm"
RPM_HASH = "a94bbd04aff5e63c0d38f7d1896d5d216184a918276bf5c679400d05289c6094b1c7fff01c62146acf108822be01774b1912d4bd9808938c87c2cded0985b98c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-osc \
git-obs \
osc \
python3-osc \
python3.13dist-osc \
python313-osc \
python3dist-osc \
rpm-macro-osc-plugin-dir"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
python-abi \
python313-cryptography \
python313-rpm \
python313-ruamel.yaml \
python313-urllib3"

inherit rpm
