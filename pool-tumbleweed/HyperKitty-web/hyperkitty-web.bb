SUMMARY = "The webroot for GNU Mailman"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the web interface."
LICENSE = "GPL-3.0-only"

PV = "1.3.12"

RPM_NAME = "HyperKitty-web-1.3.12-7.1.noarch.rpm"
RPM_HASH = "c1d73deaecdac714470e8e8049ee4be54f119626d151e4ea3f9b6d7d20cf3a771efac361b441d4a7f0a1d501bf84491bf520109a0f48f9ab89bb9e32a02e0a94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty-web \
config-HyperKitty-web"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
HyperKitty \
acl \
group-hyperkitty \
openssl \
sudo \
system-user-hyperkitty \
user-hyperkitty"

inherit rpm
