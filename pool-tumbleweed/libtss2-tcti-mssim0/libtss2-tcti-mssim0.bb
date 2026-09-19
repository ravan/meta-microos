SUMMARY = "TCTI interface library for Microsoft software TPM2 simulator"
DESCRIPTION = "TPM Command Transmission Interface library for communicating using the \
protocol exposed by the Microsoft software TPM2 simulator."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-tcti-mssim0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "2bd9cf1e7947fde7b8d4cb873a377899bb696f95854b2ba8cb9757d21104b4c21af3f480a3b431ef4c5afb274fc13a35bc0b345243eeb40e2d7afe3d23e60145"

RPROVIDES:${PN} += "libtss2-tcti-mssim.so.0 \
libtss2-tcti-mssim0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
