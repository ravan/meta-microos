SUMMARY = "System user and group 'mktex'"
DESCRIPTION = "This package provides a shared system user for TeXLive"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "system-user-mktex-1.0.0-2.14.noarch.rpm"
RPM_HASH = "6e18a7357d2e48902e6e08f3a7e8f146d2aedb872f1cf3a292062599fe325a5d8769df6feb738888f38dcf7fbe6e1b50720e89bd8845a6943f53801e63a2b790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-mktex \
system-user-mktex \
user-mktex"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
