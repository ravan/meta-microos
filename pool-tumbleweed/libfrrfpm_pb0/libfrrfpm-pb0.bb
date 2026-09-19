SUMMARY = "FRRouting fpm protobuf library"
DESCRIPTION = "This library contains forwarding plane manager protobuf definitions \
for FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.6.1"

RPM_NAME = "libfrrfpm_pb0-10.6.1-1.3.aarch64.rpm"
RPM_HASH = "7a7368d1685ba11e673c11fee69708e1cf43169f1f80f2cac8842787143209845a3234550e017d9251730f0c724926f1807628206f0ee4837be5998278019684"

RPROVIDES:${PN} += "libfrrfpm-pb.so.0 \
libfrrfpm-pb0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
