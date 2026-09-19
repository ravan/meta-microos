SUMMARY = "GNUnet library libgnunetset"
DESCRIPTION = "This package contains the libgnunetset library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetset0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "b65b00a597bc48a201f000b2ec2677831d9c4a01aae2ff05507058ceb6fb834455bd1b5de710a5afd02b371094fb14c0700f562fc3728eb76b899197c830e00b"

RPROVIDES:${PN} += "libgnunetset.so.0 \
libgnunetset0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
