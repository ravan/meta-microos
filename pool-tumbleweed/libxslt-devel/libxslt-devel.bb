SUMMARY = "Development files for libxslt"
DESCRIPTION = "libxslt allows you to transform XML files into other XML files \
(or HTML, text, and more) using the standard XSLT stylesheet \
transformation mechanism. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the XSLT libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.45"

RPM_NAME = "libxslt-devel-1.1.45-1.4.aarch64.rpm"
RPM_HASH = "8ec01b77249f65fa722a69be16a9934dc3ec516bb95c818eff0a26ed5410e0aa9148e365a8009c79d9d34f4a43575fcaa551334ee4f589504e62d4cb712e0b02"

RPROVIDES:${PN} += "libxslt-devel \
pkgconfig-libexslt \
pkgconfig-libxslt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libexslt0 \
libxslt-tools \
libxslt1 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt"

inherit rpm
