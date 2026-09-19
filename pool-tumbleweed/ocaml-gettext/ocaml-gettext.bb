SUMMARY = "OCaml library for i18n"
DESCRIPTION = "Ocaml-gettext provides support for internationalization of Ocaml \
programs. \
 \
Constraints : \
 \
* provides a pure Ocaml implementation, \
* the API should be as close as possible to GNU gettext, \
* provides a way to automatically extract translatable \
  strings from Ocaml source code."
LICENSE = "SUSE-LGPL-2.0-with-linking-exception"

PV = "0.5.0"

RPM_NAME = "ocaml-gettext-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "01a97ff89d9c78a1d86d4ab010198c737ab6fc2c402ffa892765d26fe24665bb1be74c3d1f2b41fddb9451ebf3fb95a792778e032a18d74b3143811d80ff97e2"

RPROVIDES:${PN} += "ocaml-gettext \
ocaml-gettext-camomile \
ocaml-gettext-stub \
ocaml-gettext-stub-debuginfo \
ocaml-gettext-stub-devel"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libzstd.so.1"

inherit rpm
