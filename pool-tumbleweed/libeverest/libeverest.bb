SUMMARY = "Library libeverest"
DESCRIPTION = "This subpackage of mbedtls contains libeverest"
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "3.6.7"

RPM_NAME = "libeverest-3.6.7-1.2.aarch64.rpm"
RPM_HASH = "960facb06ee37f1658176fb366acc271528629917983310effd65492a9baddafb747c9777c185a97feaf04773f782f8825c955bd7c638ebc1d3d54c9f27f2d5a"

RPROVIDES:${PN} += "libeverest \
libeverest.so"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
