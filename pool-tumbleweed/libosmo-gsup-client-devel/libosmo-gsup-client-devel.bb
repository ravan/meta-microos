SUMMARY = "Development files for the Osmocom GSUP client library"
DESCRIPTION = "This is a shared library that can be used to implement client programs for \
the GSUP protocol. The typical GSUP server is OsmoHLR, with OsmoMSC, OsmoSGSN \
and External USSD Entities (EUSEs) using this library to implement clients. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-gsup-client."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-gsup-client-devel-1.4.0-2.14.aarch64.rpm"
RPM_HASH = "886d56260c6a1d90cf5af4afbde388c00e2ab59ffa1ba6c0cc9e343f7058159917f2c79018fa95d815b93adb62609447459fcc5dd103abda8905fb2daa40b2b4"

RPROVIDES:${PN} += "libosmo-gsup-client-devel \
pkgconfig-libosmo-gsup-client"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-gsup-client.so.0 \
libosmo-gsup-client0 \
libosmocore.so.22 \
libosmogsm.so.20 \
libtalloc.so.2"

inherit rpm
