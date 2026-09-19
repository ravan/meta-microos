SUMMARY = "Bindings to the Perl Compatibility Regular Expressions library (version 2)"
DESCRIPTION = "pcre2-ocaml offers library functions for string pattern matching and \
substitution, similar to the functionality offered by the Perl language."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "8.0.4"

RPM_NAME = "ocaml-pcre2-8.0.4-2.2.aarch64.rpm"
RPM_HASH = "061c83ffb8424d4ba09acf9652423cc9f5d27d29747f08121be9f97681c1f4144e0772b104e3501c3aa009e81bc320d5b9646b557a8dbb0cef90c2bf2acd8341"

RPROVIDES:${PN} += "ocaml-pcre2"

RDEPENDS:${PN} += "libc.so.6 \
libpcre2-8.so.0"

inherit rpm
