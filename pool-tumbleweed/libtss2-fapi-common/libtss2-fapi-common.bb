SUMMARY = "Common files for FAPI interface library"
DESCRIPTION = "Provides files needed by the tpm2 Feature API (FAPI) library"
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-fapi-common-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "535dcbd680c55c5aa1bec2792d4d1d16f9fc9c64228ea0b06f7810898aa72be4ef05f40b283f04581c58bb1df3afda6950d4b94fa6a35be84ae696b77141ef29"

RPROVIDES:${PN} += "libtss2-fapi-common \
libtss2-fapi1-/usr/lib/tmpfiles.d/tpm2-tss-fapi.conf"

RDEPENDS:${PN} += "/usr/bin/sh \
user-tss"

inherit rpm
