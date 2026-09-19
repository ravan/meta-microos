SUMMARY = "GAP: Support for hashes and crypto"
DESCRIPTION = "This GAP module implements some cryptographic primitives. At the \
moment this is a custom implementation of SHA256 and HMAC, which is \
needed to sign messages in the Jupyter kernel."
LICENSE = "BSD-3-Clause"

PV = "0.10.7"

RPM_NAME = "gap-crypting-0.10.7-1.1.aarch64.rpm"
RPM_HASH = "d6c250238d55a35581d37bc9fc1dcfd13ac9c3ed0ec18c0e0a7f985ecc3ef5bf69274c5babb8a36e3e2150d76d5407632803f6d00ffd49f3610e73817e85cbe3"

RPROVIDES:${PN} += "gap-crypting"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
