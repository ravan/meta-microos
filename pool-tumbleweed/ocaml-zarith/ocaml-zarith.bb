SUMMARY = "Arbitrary precision integers"
DESCRIPTION = "The Zarith library implements arithmetic and logical operations over arbitrary-precision integers and rational numbers."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "1.14"

RPM_NAME = "ocaml-zarith-1.14-2.3.aarch64.rpm"
RPM_HASH = "4933c32a30958a69f8c4bf344dd1fe3a8ab1e6d0a69fddd9b8f64d2b1cb469913f1bbf4ec2a7c8c125282c583b73ac50f9fa8953dc00d1f01539e45071fa9282"

RPROVIDES:${PN} += "ocaml-zarith"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10"

inherit rpm
