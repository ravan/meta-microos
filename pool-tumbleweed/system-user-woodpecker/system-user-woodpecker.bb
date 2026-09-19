SUMMARY = "System user and group woodpecker"
DESCRIPTION = "This package provides the system user for the woodpecker CI system."
LICENSE = "Apache-2.0"

PV = "3.18.0"

RPM_NAME = "system-user-woodpecker-3.18.0-1.1.noarch.rpm"
RPM_HASH = "c87306066b761ffb58bd0402c01c608a9c688e996b70eb8288b9169cb0e31d35e3e7b1144262e39b4410c77154e7f087234224f899f02815c53941c095b53262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-woodpecker \
system-user-woodpecker \
user-woodpecker"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
