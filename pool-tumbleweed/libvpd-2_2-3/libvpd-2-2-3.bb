SUMMARY = "VPD Database access library for lsvpd"
DESCRIPTION = "The libvpd package contains classes that are used to access a Vital \
Product Data (VPD) database created by vpdupdate in the lsvpd package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.11"

RPM_NAME = "libvpd-2_2-3-2.2.11-1.4.aarch64.rpm"
RPM_HASH = "4d2581d627f308dd018adc0eb0f984ce26a556884c83d4fd084b9b9e8a25f86a58940535672dc23a2e55a0051bfc7f1273254fa788dfd4e961654aba68653782"

RPROVIDES:${PN} += "libvpd-2-2-3 \
libvpd-2.2.so.3 \
libvpd-cxx-2.2.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libvpd-base"

inherit rpm
