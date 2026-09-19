SUMMARY = "System user for HyperKitty"
DESCRIPTION = "System user for HyperKitty."
LICENSE = "GPL-3.0-only"

PV = "1.3.12"

RPM_NAME = "system-user-hyperkitty-1.3.12-7.1.noarch.rpm"
RPM_HASH = "0503cf08f75f75f5a41cc2fc868f7e83b886ff4a28e53a8cbda5efffd89d966dc40c4470b9338647369377145a4c7a8c223f9c472cf2a02dbb38b1ac46922a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-hyperkitty \
system-user-hyperkitty \
user-hyperkitty"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
