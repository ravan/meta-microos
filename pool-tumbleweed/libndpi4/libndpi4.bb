SUMMARY = "Extensible deep packet inspection library"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. nDPI was modified to \
be more suitable for traffic monitoring applications, by disabling \
specific features that slow down the DPI engine while being them \
un-necessary for network traffic monitoring."
LICENSE = "LGPL-3.0-only"

PV = "4.12"

RPM_NAME = "libndpi4-4.12-1.8.aarch64.rpm"
RPM_HASH = "d865d5b11ca08e797f7ec48a11c61faacc837cffc0cf46501997d1d0fdfb125e4b5f7bde5063bdcd22089ca30bb6c8a00042eacd174b23169ac3c8ae6eb7ac85"

RPROVIDES:${PN} += "libndpi.so.4 \
libndpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
ndpi-common"

inherit rpm
