SUMMARY = "FUSE file system backed by Amazon S3 bucket"
DESCRIPTION = "FUSE-based file system backed by Amazon S3. Mount a bucket as a local \
file system read/write. Store files/folders natively and transparently"
LICENSE = "GPL-2.0-or-later"

PV = "1.97"

RPM_NAME = "s3fs-1.97-1.6.aarch64.rpm"
RPM_HASH = "9f7726eb674948d6b206ad8eaff63229c04c66ed2b9f6b9887406b5901c53afa449e256bd58f832117db17c39c604a864236a4239d89c8c10f89cb4308a995b9"

RPROVIDES:${PN} += "s3fs"

RDEPENDS:${PN} += "fuse3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfuse3.so.4 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
