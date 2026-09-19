SUMMARY = "System user and group 'bin'"
DESCRIPTION = "This package provides the system account and group 'bin' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-bin-20250822-2.3.noarch.rpm"
RPM_HASH = "e1ca9561a62400b8cbe7ec6eb29dafd5f2c71ff00d1f2b6a00fe6f67c7c98d18584359eae7e9e809e4e3400bcec55cf041a0cb92d1f6891e287c0f7000f54989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-bin \
system-user-bin \
user-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
