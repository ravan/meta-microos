SUMMARY = "Patch library purely in OCaml"
DESCRIPTION = "This is a library which parses unified diff and git diff output, and can \
apply a patch in memory."
LICENSE = "ISC"

PV = "3.1.2"

RPM_NAME = "ocaml-patch-3.1.2-1.2.aarch64.rpm"
RPM_HASH = "1159ee2255ce81cb4fbc2490e12fd0969908997f94c44ab27065d6406bb07a51ee9d8f9865e47a3269c2274f62c362f7a0489f11548222b2afdbcbabc7e3e924"

RPROVIDES:${PN} += "ocaml-patch"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
