SUMMARY = "Development files for cld2"
DESCRIPTION = "A library that detects over 80 languages in UTF-8 text, based largely \
on groups of four letters. Also tables for 160+ language versions. \
 \
This subpackage contains the headers for cld2."
LICENSE = "Apache-2.0"

PV = "20150820"

RPM_NAME = "cld2-devel-20150820-6.9.aarch64.rpm"
RPM_HASH = "824fd36762a6ca9b1be0f6e3ae3098a2322447bf01b9408e5ad44ece07ddc1a50fdd5f658fb240c6474cf8ab3eb532af4e205d73c6b583edbda21f9222602e17"

RPROVIDES:${PN} += "cld2-devel \
pkgconfig-cld2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcld2-0"

inherit rpm
