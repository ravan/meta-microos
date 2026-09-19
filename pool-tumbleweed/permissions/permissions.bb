SUMMARY = "SUSE Linux Default Permissions"
DESCRIPTION = "File and directory permission settings depending on the local security \
settings. The local security setting ('easy', 'secure', or 'paranoid') can be \
configured in /etc/sysconfig/security. \
 \
This package does not contain files, it just requires the necessary packages."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20260806"

RPM_NAME = "permissions-1699_20260806-1.1.aarch64.rpm"
RPM_HASH = "55ec56459760660daa8d60358eaecd97196adec8bedbe3b3107c2f71ccfee15a42e1a02bbf6cf50eaa7acbc29d974c5ff1e09b637f23968f2707ec839c12d100"

RPROVIDES:${PN} += "aaa-base-/usr/share/permissions \
permissions"

RDEPENDS:${PN} += "permctl \
permissions-config"

inherit rpm
