SUMMARY = "GNUnet library libgnunetvpn"
DESCRIPTION = "This package contains the libgnunetvpn library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetvpn0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "100973f16afdfab1bb2c50837fe3e5a2f7555671e0fa5574de533cf5704a0f0183e69004d865dc79aff05de8563cbc74e5b79e5b14d80b3ca26b201a8bd1f1e2"

RPROVIDES:${PN} += "libgnunetvpn.so.0 \
libgnunetvpn0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
