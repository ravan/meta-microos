SUMMARY = "Cryptography library for Guile using Libgcrypt"
DESCRIPTION = "Guile-Gcrypt provides a Guile 2.x interface to a subset of the GNU \
Libgcrypt crytographic library. It provides modules for cryptographic \
hash functions, message authentication codes (MAC), public-key cryptography, \
strong randomness, and more. It is implemented using the foreign function \
interface (FFI) of Guile."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "guile-gcrypt-0.4.0-1.12.aarch64.rpm"
RPM_HASH = "abcba76974d0f59961965cf8cb10a64b9fd0d8c32acfd3dd31249c442a57592ff3f1c1da225eb065079f1334a99f5fad18e60175dff47f193acb0d6cb55623c9"

RPROVIDES:${PN} += "guile-gcrypt"

RDEPENDS:${PN} += "/usr/bin/sh \
guile \
libgcrypt-devel"

inherit rpm
