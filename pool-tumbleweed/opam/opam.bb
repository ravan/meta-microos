SUMMARY = "Source-based package manager for OCaml"
DESCRIPTION = "OPAM is a source-based package manager for OCaml. It supports multiple \
simultaneous compiler installations, flexible package constraints, and a \
Git-friendly development workflow."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "2.5.2"

RPM_NAME = "opam-2.5.2-1.3.aarch64.rpm"
RPM_HASH = "4c58c69c0a358151128f56b5680767430e9e7e92ba9916980056d573719d78e9b1fbc1e86cba49840b44ff8455a35c4e5eda609db6d1f370db5bcba67e95438a"

RPROVIDES:${PN} += "opam"

RDEPENDS:${PN} += "/usr/bin/ocamlrun-a100 \
bubblewrap \
curl \
diffutils \
gzip \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
opam-installer \
patch \
tar \
unzip"

inherit rpm
