SUMMARY = "ZArchive library"
DESCRIPTION = "This subpackage contains the ZArchive library"
LICENSE = "MIT-0"

PV = "0.1.2+git20240721.b467f7a"

RPM_NAME = "libzarchive0_1-0.1.2+git20240721.b467f7a-1.8.aarch64.rpm"
RPM_HASH = "a59b18bcb5d263516276bf375d2967ad03b81ebf52d3d592f08fc51923447a8ab3ad204b5d510dd02dd97665ff7aeee5a113b76a73a56dd76478609f4d9e4560"

RPROVIDES:${PN} += "libzarchive.so.0.1 \
libzarchive0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
