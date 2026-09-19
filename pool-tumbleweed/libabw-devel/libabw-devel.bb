SUMMARY = "Files for Developing with libabw"
DESCRIPTION = "Libabw is library providing ability to interpret and import AbiWord documents \
into various applications. \
 \
This package contains the libabw development files."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libabw-devel-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "0aec22e765f0f3113b6ef0d8ef3979fce28136eedc1760a2a8e49a92c7a95f27a7c99fe39ee164de635e0f79d104e104c9b7ce4c7f907e9319a548310dd3e105"

RPROVIDES:${PN} += "libabw-devel \
pkgconfig-libabw-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libabw-0-1-1 \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-stream-0.0 \
pkgconfig-libxml-2.0 \
pkgconfig-zlib"

inherit rpm
