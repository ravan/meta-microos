SUMMARY = "KIWI - Dracut module for iso(live) image type"
DESCRIPTION = "This package contains the kiwi-live dracut module which is used \
for booting iso(live) images built with KIWI"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "dracut-kiwi-live-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "9800709f043dcd4d7a78d31385a866a42a818d45a381cd0b6c6d0ec3288e142c12fbf690a8f81bc8339e8ae685eaca43a4e7d8523430016997443bda1369bba6"

RPROVIDES:${PN} += "dracut-kiwi-live"

RDEPENDS:${PN} += "/usr/bin/bash \
device-mapper \
dialog \
dracut \
e2fsprogs \
util-linux \
util-linux-systemd \
xfsprogs"

inherit rpm
