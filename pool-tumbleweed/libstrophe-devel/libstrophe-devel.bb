SUMMARY = "Development files for libstrophe"
DESCRIPTION = "Development files and headers for libstrophe"
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.14.0"

RPM_NAME = "libstrophe-devel-0.14.0-2.6.aarch64.rpm"
RPM_HASH = "28135ee5b085a298e95f6cc7cda16878e80e76b48d288cef200b794aedd2d244333fca2f74cde8aa49cf79bcce46c226045ccc4ea113a2150b93f8a3b4519408"

RPROVIDES:${PN} += "libstrophe-devel \
pkgconfig-libstrophe"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstrophe0 \
pkgconfig-libxml-2.0 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
