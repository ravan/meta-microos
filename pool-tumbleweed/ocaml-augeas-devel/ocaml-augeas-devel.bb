SUMMARY = "Development files for ocaml-augeas"
DESCRIPTION = "The ocaml-augeas-devel package contains libraries and signature files for \
developing applications that use ocaml-augeas."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7"

RPM_NAME = "ocaml-augeas-devel-0.7-3.2.aarch64.rpm"
RPM_HASH = "aae87d14e570b4c939d003e3abedfb0bea4d828e2013c7e3f6579c85d4bacc3a6bf69e52f8c416f543c95bbb391281f1f86dcdee401ccc177f427eff23f6b0ea"

RPROVIDES:${PN} += "config-ocaml-augeas-devel \
ocaml-Augeas \
ocaml-augeas-devel \
ocamlfind-augeas \
ocamlx-Augeas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaugeas.so.0 \
libc.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Either \
ocaml-Stdlib--List \
ocaml-Stdlib--Seq \
ocaml-augeas \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--List"

inherit rpm
