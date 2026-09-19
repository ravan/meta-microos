SUMMARY = "Development files for ocaml-sha"
DESCRIPTION = "The ocaml-sha-devel package contains libraries and signature files for \
developing applications that use ocaml-sha."
LICENSE = "ISC"

PV = "1.15.4"

RPM_NAME = "ocaml-sha-devel-1.15.4-2.2.aarch64.rpm"
RPM_HASH = "85c082ee7dffc514ab9f5cf6b707724368580586c43d3b517526a23c8a556e6daaa418baead2945e6e165a0f8c83c6e8eb19fe2280e7b92aaf40ceb69a41aed7"

RPROVIDES:${PN} += "config-ocaml-sha-devel \
ocaml-Sha1 \
ocaml-Sha256 \
ocaml-Sha512 \
ocaml-sha-devel \
ocamlfind-sha \
ocamlx-Sha1 \
ocamlx-Sha256 \
ocamlx-Sha512"

RDEPENDS:${PN} += "libc.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-sha \
ocamlfind-stdlib-shims \
ocamlx-Stdlib \
ocamlx-Stdlib--Bytes"

inherit rpm
