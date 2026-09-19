SUMMARY = "GNUnet library libgnunetsecretsharing"
DESCRIPTION = "This package contains the libgnunetsecretsharing library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetsecretsharing0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "c1b223d4b1b0a8f6a8e50a15fee97408770fd4cf21574082fa15a631b07e2da98133eb76c0e8499846b8992cfa0add1dc86972118159887e941b209408142b49"

RPROVIDES:${PN} += "libgnunetsecretsharing.so.0 \
libgnunetsecretsharing0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnunetutil.so.20"

inherit rpm
