SUMMARY = "IPv4 and IPv6 Networking Utilities"
DESCRIPTION = "This package contains some small network tools for IPv4 and IPv6 like \
ping, arping and tracepath."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "20250605"

RPM_NAME = "iputils-20250605-1.6.aarch64.rpm"
RPM_HASH = "72b6c904a8a85224e8fe0df5fb5c8b90f2dba2e62eaa2b44f61a72536b45e9b96fbf846b40c0248038e597804095f064f59be23b4fcbfb25627e5a565ef20d7f"

RPROVIDES:${PN} += "/sbin/arping \
/usr/bin/ping \
iputils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libidn2.so.0 \
permissions"

inherit rpm
