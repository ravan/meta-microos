SUMMARY = "System user and group uuidd"
DESCRIPTION = "This package provides the system account and group 'uuidd'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-uuidd-20250822-2.3.noarch.rpm"
RPM_HASH = "2c80934c93e2bf2b91aa8addd6ff872a23ce4e8afcafafc9d5a5d2ab340c1148ff269d17fd142875630d7aee2728d235d70f3d8d3b9e8788de2820243e836e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-uuidd \
system-user-uuidd \
user-uuidd"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
