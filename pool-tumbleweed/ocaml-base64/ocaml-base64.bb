SUMMARY = "Base64 encoding and decoding in OCaml"
DESCRIPTION = "Base64 for OCaml. Base64 is a group of similar binary-to-text encoding schemes \
that represent binary data in an ASCII string format by translating it into a \
radix-64 representation. It is specified in RFC 4648."
LICENSE = "ISC"

PV = "3.5.2"

RPM_NAME = "ocaml-base64-3.5.2-2.1.aarch64.rpm"
RPM_HASH = "1c0ff15e645a5fb4266d6e1c0d11ce0e95aa62433a28ba45504aba26f7eade34a53fa3b194f013bed242bf5bb7c4196dcaea745c06a6c2e0c4b5a8e5d9d6f11c"

RPROVIDES:${PN} += "ocaml-base64"

RDEPENDS:${PN} += ""

inherit rpm
