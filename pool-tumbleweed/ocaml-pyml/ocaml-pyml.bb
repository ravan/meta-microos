SUMMARY = "Stdcompat: compatibility module for OCaml standard library"
DESCRIPTION = "Stdcompat is a compatibility layer allowing programs to use some recent additions to the OCaml standard library while preserving the ability to be compiled on former versions of OCaml."
LICENSE = "BSD-2-Clause"

PV = "20250807"

RPM_NAME = "ocaml-pyml-20250807-2.2.aarch64.rpm"
RPM_HASH = "c40c90d86a1728587ac39b4a7e85af84b6949478c1975501c7f4c9a104ddc21e20ef6ad10340b1d8a877a5460898cdf3b6f6d16363011fb8eca7a73d151184bf"

RPROVIDES:${PN} += "ocaml-pyml"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
