SUMMARY = "YaST2 - Easy Installation of Add-on RPMs using Metapackages"
DESCRIPTION = "With this technology users can install packages and add repositories \
with a simple click on a link in a website."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "yast2-metapackage-handler-5.0.0-1.15.noarch.rpm"
RPM_HASH = "5efa399b12fbe976bd84e56edeb1eac089e6fd3bd305a0686de4de5c2c0e2f31bc340ed2cae676691638212f42305fa7f205886b0b207b8a9418e6d624071a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-metapackage-handler"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/xdg-su \
yast2 \
yast2-country-data \
yast2-packager \
yast2-ruby-bindings \
yast2-transfer"

inherit rpm
