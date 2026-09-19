SUMMARY = "Development files for the libfixbuf library"
DESCRIPTION = "libfixbuf aims to be a compliant implementation of the IPFIX Protocol \
and message format, from which IPFIX Collecting Processes and \
IPFIX Exporting Processes may be built. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfixbuf."
LICENSE = "LGPL-3.0-only"

PV = "2.5.4"

RPM_NAME = "libfixbuf-devel-2.5.4-1.4.aarch64.rpm"
RPM_HASH = "6ef40a108c6c89935afc3194e0359caaec80e06780282bc16a913cfee05d0a8aca129e2cc86d6a52afba2dc3df8b3accc2fe5413d6c36525061fe9b413b7aab9"

RPROVIDES:${PN} += "libfixbuf-devel \
pkgconfig-libfixbuf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfixbuf9 \
pkgconfig-glib-2.0"

inherit rpm
