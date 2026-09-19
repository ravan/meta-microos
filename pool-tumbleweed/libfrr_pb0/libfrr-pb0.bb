SUMMARY = "FRRouting protobuf library"
DESCRIPTION = "This library contains protobuf memory management for FRRouting.."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.6.1"

RPM_NAME = "libfrr_pb0-10.6.1-1.3.aarch64.rpm"
RPM_HASH = "beaf126e91a2ed68aa9169cd5609501ea9c30fb9e92af0b073243478fda91efa559e11ef74414da25c37b66d2ca8cb4c20b1237c2415600c52b4a1c778351416"

RPROVIDES:${PN} += "libfrr-pb.so.0 \
libfrr-pb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libprotobuf-c.so.1"

inherit rpm
