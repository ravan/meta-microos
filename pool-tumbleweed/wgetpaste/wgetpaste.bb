SUMMARY = "Command-line interface to various pastebins"
DESCRIPTION = "Command-line interface to communicate with various pastebin services."
LICENSE = "MIT"

PV = "2.34"

RPM_NAME = "wgetpaste-2.34-1.7.noarch.rpm"
RPM_HASH = "238745e991ea281829c9048e8702d66be868059e0574d0b03e869773e0b3b6b0c79db7a97699f9893ebc5e1be5aafd19ef2ea5237f1986f7d7aa1b699130f759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-wgetpaste \
wgetpaste"

RDEPENDS:${PN} += "/usr/bin/env \
bash \
coreutils \
wget"

inherit rpm
