SUMMARY = "FAPI interface library"
DESCRIPTION = "This is the tpm2 Feature API (FAPI) library. This API is designed to be very \
high-level API, intended to make programming with the TPM as simple as \
possible."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-fapi1-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "c4960d76d7e58e3fa344a7db6cf956b5a95bbe6b0bbdfa9fb721738aafa084d2a38ee06c3c05952134fc39d9facbc1cd4477b216171db747436078107330d2db"

RPROVIDES:${PN} += "libtss2-fapi.so.1 \
libtss2-fapi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libjson-c.so.5 \
libtss2-esys.so.0 \
libtss2-fapi-common \
libtss2-mu.so.0 \
libtss2-tctildr.so.0 \
libuuid.so.1"

inherit rpm
