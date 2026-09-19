SUMMARY = "System user for HyperKitty"
DESCRIPTION = "System user for HyperKitty."
LICENSE = "GPL-3.0-only"

PV = "1.3.13"

RPM_NAME = "system-user-postorius-1.3.13-8.1.noarch.rpm"
RPM_HASH = "8db1eeb9020429d31ce63600b62060519eb7d27717cb9a9d8db3bbd8aabb241fa62050c38be3146a96e9ce1c7d8e55467c60ce6016ca24e5e2b68a02f86b216f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-postorius \
system-user-postorius \
user-postorius"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
