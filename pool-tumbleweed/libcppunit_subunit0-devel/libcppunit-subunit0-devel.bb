SUMMARY = "Header files for applications that use cppunit and subunit"
DESCRIPTION = "Header files and libraries for developing applications that use cppunit \
and subunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "libcppunit_subunit0-devel-1.4.6-1.2.aarch64.rpm"
RPM_HASH = "9cc258e4cbdc4b6e5e0b22900e0cbc78e6b3e05789f4022cadd45617f5ed633747b94276b35d5646fa808d654fbd276671204afe672917a7ae216892e0e179f7"

RPROVIDES:${PN} += "libcppunit-subunit0-devel \
pkgconfig-libcppunit-subunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cppunit-devel \
libcppunit-subunit0 \
subunit-devel"

inherit rpm
