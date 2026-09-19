SUMMARY = "PC/SC Smart Card Library"
DESCRIPTION = "PC/SC Lite provides a Windows SCard interface in a small form factor \
for communication with smart cards and readers. \
 \
Security aware people should read the SECURITY file for possible \
vulnerabilities of pcsclite and how to fix them. For information on how \
to install drivers please read the DRIVERS file. \
 \
Memory cards will be supported through the MCT specification, which is \
an APDU like manner sent normally through the SCardTransmit() function. \
This functionality is exercised in the driver."
LICENSE = "BSD-3-Clause"

PV = "2.3.3"

RPM_NAME = "libpcsclite1-2.3.3-2.4.aarch64.rpm"
RPM_HASH = "5e86838a4bd81f8c819f6af1f18dd15bd6cb6cfc7629c866a5eb056f2ccb84b95370cfc8b7ab729e1c71ae904815634f69fa8e1c1a83ba88f977ba54101bf0cb"

RPROVIDES:${PN} += "libpcsclite-real.so.1 \
libpcsclite.so.1 \
libpcsclite1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
