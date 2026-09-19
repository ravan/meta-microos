SUMMARY = "iSCSI client library and utilities"
DESCRIPTION = "libiscsi is a clientside library to implement the iSCSI protocol \
that can be used to access resource of an iSCSI target. \
 \
The library is fully asynchronous with regards to iSCSI commands and \
SCSI tasks, but a synchronous layer is also provided for ease of use \
for simpler applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.3"

RPM_NAME = "libiscsi11-1.20.3-1.3.aarch64.rpm"
RPM_HASH = "bede57e9d1436e7043cc5beb7fbb1f7fbbfc6d2639b22ee2ee7a2b89494788f5544d8ae838ee223e587ecf34fa6145c50416874f8357f93fede612cf645c14b1"

RPROVIDES:${PN} += "libiscsi.so.11 \
libiscsi11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
