SUMMARY = "Tool to clean up a system for cloning preparation"
DESCRIPTION = "A tool to clean up a system for cloning preparation by cleaning up \
usage history and log files, etc."
LICENSE = "GPL-2.0-or-later"

PV = "1.12"

RPM_NAME = "clone-master-clean-up-1.12-1.8.noarch.rpm"
RPM_HASH = "7059286c1199ab1504c89c872d1ef066ffe20d091620fa09e39e13f7895dc0b0d45bd7e33163d52d69e7b47f2dede9ce874e30de437a9118ad3e39866738a879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clone-master-clean-up \
config-clone-master-clean-up"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
curl \
fillup \
sed \
systemd"

inherit rpm
