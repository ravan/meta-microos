SUMMARY = "Files for Developing with libexttextcat"
DESCRIPTION = "The libexttextcat is a library implementing N-gram-based text categorization \
 \
This package contains the libexttextcat development files."
LICENSE = "BSD-4-Clause"

PV = "3.4.7"

RPM_NAME = "libexttextcat-devel-3.4.7-2.9.aarch64.rpm"
RPM_HASH = "e1db9de7465bc9b74eb0d966b309ce05fe730b244e2d2299d07b4b539dc9f71173bf7c9d140be65db3e2628d8dd137d0ed5246939139dd184b3353b5292a4f9d"

RPROVIDES:${PN} += "libexttextcat-devel \
libtextcat-devel \
pkgconfig-libexttextcat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libexttextcat-2-0-0"

inherit rpm
