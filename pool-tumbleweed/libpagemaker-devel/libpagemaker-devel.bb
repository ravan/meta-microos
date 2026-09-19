SUMMARY = "Files for Developing with libpagemaker"
DESCRIPTION = "libpagemaker is library providing ability to interpret and import \
Adobe PageMaker documents into various applications. \
 \
This package contains the libpagemaker development files."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-devel-0.0.4-1.40.aarch64.rpm"
RPM_HASH = "14cfd0a05aca6aa34bfa9098146a90f7273cc67ea75d710aca3c59588ef98a9599c741f24eb450541f5ec3c45ba18a9ce53d98ed5f9f4182b7a887a990e3d505"

RPROVIDES:${PN} += "libpagemaker-devel \
pkgconfig-libpagemaker-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpagemaker-0-0-0 \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-stream-0.0"

inherit rpm
