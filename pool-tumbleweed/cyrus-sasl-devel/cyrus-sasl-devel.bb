SUMMARY = "Cyrus SASL API Implementation, Libraries and Header Files"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-devel-2.1.28-12.5.aarch64.rpm"
RPM_HASH = "1da2a070561c1b96e6b47b646c5ef3dbe49f655dff093e222fb9bf63214f918c77dc7e4bb8d5e102961cd400d01e0d9b6c4a9a7db01b16131076715a04eeffa0"

RPROVIDES:${PN} += "cyrus-sasl-devel \
pkgconfig-libsasl2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsasl2-3"

inherit rpm
