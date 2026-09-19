SUMMARY = "GNUnet library libgnunettestbed"
DESCRIPTION = "This package contains the libgnunettestbed library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunettestbed0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "408b063271642fa380f5442f26789dcf3a6f85419809ca5cde00c09cd5d21206fe4b181013cf7a60b5836cca7e283d5a0e72acffa1aa82dcb047907361730e6a"

RPROVIDES:${PN} += "libgnunettestbed.so.0 \
libgnunettestbed0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
