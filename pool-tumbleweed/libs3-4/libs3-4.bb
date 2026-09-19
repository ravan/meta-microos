SUMMARY = "Shared library from libs3"
DESCRIPTION = "This package includes the libs3 shared object library, needed to run \
applications compiled against libs3, and additionally contains the s3 \
utility for accessing Amazon S3."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "4.1.git277"

RPM_NAME = "libs3-4-4.1.git277-1.27.aarch64.rpm"
RPM_HASH = "b77801eea5f72d5c1c2e951db9ab247446e2274822b1162c71825f29155fa586bb7f48e08b513c3ebae2a26012b8bede3ea91ee83a50ae774f4d13d29758ed2f"

RPROVIDES:${PN} += "libs3-4 \
libs3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libxml2.so.16"

inherit rpm
