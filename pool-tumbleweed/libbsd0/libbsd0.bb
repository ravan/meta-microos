SUMMARY = "Library with functions commonly found on BSD systems"
DESCRIPTION = "This library provides functions commonly found on BSD systems, and \
lacking on others like GNU systems, thus making it easier to port projects \
with strong BSD origins, without needing to embed the same code over and \
over again on each project."
LICENSE = "BSD-3-Clause"

PV = "0.11.7"

RPM_NAME = "libbsd0-0.11.7-2.12.aarch64.rpm"
RPM_HASH = "c29b5f0964ee7baaf67494671f12bb22d4b4b4e01786b9dab3f5f3715bd6f3c65dceebff564ae952c5af5d2f027dbecd3591b208a07b7831cc6366c4bff73b3f"

RPROVIDES:${PN} += "libbsd.so.0 \
libbsd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmd.so.0"

inherit rpm
