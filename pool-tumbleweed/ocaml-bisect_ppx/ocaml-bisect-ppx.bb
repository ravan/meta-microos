SUMMARY = "Code coverage for OCaml and Reason"
DESCRIPTION = "Bisect_ppx is a code coverage tool for OCaml and Reason. It helps you test thoroughly by showing what's not tested."
LICENSE = "GPL-2.0-only"

PV = "2.8.3"

RPM_NAME = "ocaml-bisect_ppx-2.8.3-2.3.aarch64.rpm"
RPM_HASH = "dd985651ba3b9b433c9a1cf154bb1d2af0b547eb8c8c1b442104b1312d63fe6be6518b8f2159567100991243a8794bec2b75922921881e534b61ef66d5e3e2c3"

RPROVIDES:${PN} += "ocaml-bisect-ppx"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
