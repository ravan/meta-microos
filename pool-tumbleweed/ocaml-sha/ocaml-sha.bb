SUMMARY = "Binding to the SHA cryptographic functions"
DESCRIPTION = "A binding for SHA interface code in OCaml. Offering the same interface than \
the MD5 digest included in the OCaml standard library. \
It's currently providing SHA1, SHA256 and SHA512 hash functions."
LICENSE = "ISC"

PV = "1.15.4"

RPM_NAME = "ocaml-sha-1.15.4-2.2.aarch64.rpm"
RPM_HASH = "080eca1d4a1b2fe90bcbe536caf527148bd83aec62a0ffcd8bf062eb998cd78c88bac0a0bf93407c081a6707b52afcb33a0791997390d052260d5f532c33e568"

RPROVIDES:${PN} += "ocaml-sha"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
