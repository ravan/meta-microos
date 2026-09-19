SUMMARY = "Utilities for SCTP (Stream Control Transmission Protocol)"
DESCRIPTION = "This package contains the SCTP base runtime library and command line \
tools. \
 \
SCTP (Stream Control Transmission Protocol) is a message-oriented, \
reliable transport protocol with congestion control, support for \
transparent multihoming, and multiple ordered streams of messages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.21"

RPM_NAME = "lksctp-tools-1.0.21-1.8.aarch64.rpm"
RPM_HASH = "acdaddcef6df998d067f437d78f117459c0418613b5e428914be52786503197cbd12ae3b48bf14cafb0ddb95af1ec6a1bdc529361ded561b9c4dc1210d468b9d"

RPROVIDES:${PN} += "libsctp.so.1 \
libwithsctp.so.1 \
lksctp-tools"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
