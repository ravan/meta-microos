SUMMARY = "Non-blocking streaming Unicode codec for OCaml"
DESCRIPTION = "Uutf is a non-blocking streaming codec to decode and encode the UTF-8, \
UTF-16, UTF-16LE and UTF-16BE encoding schemes. It can efficiently \
work character by character without blocking on IO. Decoders perform \
character position tracking and support newline normalization. \
 \
Functions are also provided to fold over the characters of UTF encoded \
OCaml string values and to directly encode characters in OCaml \
Buffer.t values."
LICENSE = "ISC"

PV = "1.0.4"

RPM_NAME = "ocaml-uutf-1.0.4-2.1.aarch64.rpm"
RPM_HASH = "f405f62c5f1bea5d14fdb7dad3a2b40861e957040eb57e322c572bbcbaf2e4e2d9c75284398a98dea7f8367dc730ffa6489abc1685495e380e9ebbe646c10602"

RPROVIDES:${PN} += "ocaml-uutf"

RDEPENDS:${PN} += ""

inherit rpm
