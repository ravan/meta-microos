SUMMARY = "Central configuration for Display Managers"
DESCRIPTION = "openSUSE tries to concentrate common configuration of multiple display managers \
in a central place (/etc/sysconfig/displaymanager). The most relevant setting to \
configure there is AUTOLOGIN. \
 \
This package is required by the various display managers that integrate into the config hooks."
LICENSE = "MIT"

PV = "1.1.17"

RPM_NAME = "displaymanager-sysconfig-1.1.17-5.3.aarch64.rpm"
RPM_HASH = "7f445bfcdb92f02b56b5f99176e49118b87482b49c18683873fe3818f529bd7ee790616c98fe512d5b2844e22eed3f5580382090a22f8a350987fcb1a55ee74b"

RPROVIDES:${PN} += "displaymanager-sysconfig"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup"

inherit rpm
