SUMMARY = "Configuration for the SELinux policy management library"
DESCRIPTION = "Configuration file for libsemanage. Moved to a separate package to allow \
parallel installation"
LICENSE = "LGPL-2.1-or-later"

PV = "3.11"

RPM_NAME = "libsemanage-conf-3.11-1.2.aarch64.rpm"
RPM_HASH = "28dfac37a3ea4bd70a88485b7a74651027cd364c6e6769a5c54eb701dd1c73e6979f25645f485b905732523f23fd0dc3872eff855c51560be032f09e10fc0ab0"

RPROVIDES:${PN} += "config-libsemanage-conf \
libsemanage-conf \
libsemanage-conf-storeroot-etc"

RDEPENDS:${PN} += ""

inherit rpm
