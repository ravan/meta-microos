SUMMARY = "GNUnet library libgnunettransportmonitor"
DESCRIPTION = "This package contains the libgnunettransportmonitor library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunettransportmonitor0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "f5cc7ef4ddf6addb8a3e57b149a351b7c9e4dd596c0c1121108bd638d1643d8145f979cd7234d9d0e7b601a4efc2ce37d494a8ce9c94abe45fbd209f3a528f6f"

RPROVIDES:${PN} += "libgnunettransportmonitor.so.0 \
libgnunettransportmonitor0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
