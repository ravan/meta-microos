SUMMARY = "Frontend to rsync's delta algorithm"
DESCRIPTION = "rdiff computes and applies signature-based file differences."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.4"

RPM_NAME = "rdiff-2.3.4-1.13.aarch64.rpm"
RPM_HASH = "4d3cf4c5cef3f707838ec2e9ba93e136e8d13d1fe9089980591d1cd55b6cbea5f60ab1422166752ccef0f2d5b3c9585e1866e67ad6e578f101d0d3f56df2bed0"

RPROVIDES:${PN} += "rdiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpopt.so.0 \
librsync.so.2"

inherit rpm
