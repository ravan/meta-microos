SUMMARY = "Cyrus SASL API Implementation, Libraries and Header Files"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-devel-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "b63d331345f86c8bc07da293c67cd301eeb2bfb2bb1ae01485e8216a34fe87061fdadbe2e96e00cc49f446f0f373a23a9dca3270a54800de9011dcc12289cee3"

RPROVIDES:${PN} += "cyrus-sasl-bdb-devel \
pkgconfig-libsasl2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsasl2-3"

inherit rpm
