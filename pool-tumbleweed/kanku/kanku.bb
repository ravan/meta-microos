SUMMARY = "Development and continuous integration"
DESCRIPTION = "kanku is a utility for integration of kiwi images built \
by the Open Build Service (OBS) in a development and testing workflow. \
 \
It provides a framework for automation of setups, \
e.g. to prepare development environments or run simple tests."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-1.0.0-2.2.noarch.rpm"
RPM_HASH = "40c35a2cd496e45fdc0e72b06ee842a90e184d5c756142ec370a89388876175a27c362c891ae1bc98d812637302d1ac8cf81e7ec4da1482f0880ae2e7edf6e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku"

RDEPENDS:${PN} += "kanku-cli \
kanku-dispatcher \
kanku-iptables \
kanku-scheduler \
kanku-triggerd \
kanku-web \
kanku-worker"

inherit rpm
