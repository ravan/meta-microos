SUMMARY = "RPM macros for building OCaml source packages"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package contains a set of helper macros to unify common code used \
in ocaml spec files."
LICENSE = "GPL-2.0-only"

PV = "20260707"

RPM_NAME = "ocaml-rpm-macros-20260707-1.1.aarch64.rpm"
RPM_HASH = "8c25a793f02d6483526d2b1869aa6f32d5e3c2f79105720adb8797d26619b602c237c87b94be6ae44379184d8f980d854ae5037fe93cdc7b02e76ef6bc90ace5"

RPROVIDES:${PN} += "ocaml-rpm-macros \
rpm-macro--find-debuginfo-dwz-opts \
rpm-macro--oasis-docdir-base \
rpm-macro--oasis-docdir-dvi \
rpm-macro--oasis-docdir-html \
rpm-macro--oasis-docdir-pdf \
rpm-macro--oasis-docdir-ps \
rpm-macro-oasis-docdir \
rpm-macro-oasis-docdir-dvi \
rpm-macro-oasis-docdir-html \
rpm-macro-oasis-docdir-pdf \
rpm-macro-oasis-docdir-ps \
rpm-macro-oasis-setup \
rpm-macro-ocaml-create-file-list \
rpm-macro-ocaml-dune-build \
rpm-macro-ocaml-dune-install \
rpm-macro-ocaml-dune-setup \
rpm-macro-ocaml-dune-test \
rpm-macro-ocaml-native-compiler \
rpm-macro-ocaml-oasis-build \
rpm-macro-ocaml-oasis-configure \
rpm-macro-ocaml-oasis-doc \
rpm-macro-ocaml-oasis-findlib-install \
rpm-macro-ocaml-oasis-install \
rpm-macro-ocaml-oasis-test \
rpm-macro-ocaml-preserve-bytecode \
rpm-macro-ocaml-standard-library \
rpm-macro-suse-ocaml-native-compiler"

RDEPENDS:${PN} += ""

inherit rpm
