SUMMARY = "Utilities for accessing NFS servers"
DESCRIPTION = "The utils-libnfs package contains simple client programs for \
accessing NFS servers using libnfs."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "6.0.2"

RPM_NAME = "utils-libnfs-6.0.2-1.3.aarch64.rpm"
RPM_HASH = "ea0399005a2484e807399291b06bec8da5bc3865154eab7863b9818933a836122cebb7aea0c43360118044f77b9ab2f5d5e9577d4a0c7ccc4aca323b95218a4a"

RPROVIDES:${PN} += "libnfs \
utils-libnfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfs.so.16"

inherit rpm
