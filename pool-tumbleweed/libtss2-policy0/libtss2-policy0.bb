SUMMARY = "TPM2 FAPI policy library"
DESCRIPTION = "Library that exposes the internal FAPI policy engine as a consumable \
library and stable API. Users can take arbitrary JSON policy strings \
and implement the callbacks required to produce calculated policies \
without a TPM as well as execute policies on an ESYS TR session for \
satisfying access policies on an object."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-policy0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "bb3f0bdec6f594ea54ccfdf10dc993099b6c04f545c54d830ae495b05b16ac66aafeaea6a9c62ee38958c6a5bdbf9808a5e55abf3ba1641bb72a331b3def59dc"

RPROVIDES:${PN} += "libtss2-policy.so.0 \
libtss2-policy0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjson-c.so.5 \
libtss2-esys.so.0 \
libtss2-mu.so.0"

inherit rpm
