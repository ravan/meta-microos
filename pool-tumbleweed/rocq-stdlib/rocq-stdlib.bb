SUMMARY = "Standard library for the Rocq prover"
DESCRIPTION = "The Rocq standard library consists of fundamental logic, number types like \
natural numbers, integers, and floating point numbers, as well as containers \
like lists, sets and relations."
LICENSE = "LGPL-2.1-only"

PV = "9.2.0"

RPM_NAME = "rocq-stdlib-9.2.0-1.1.aarch64.rpm"
RPM_HASH = "34f8ccf241b3aabebe9c411f08d597524e30eb628c6f90b3a9e9f44a4d0383cc00dec1ce9921930bc770ca7aaa7ce0fd838516d00a367a6243ed0cbd7c360910"

RPROVIDES:${PN} += "coq-/usr/lib64/coq/theories/Logic/Classical.vo \
rocq-stdlib"

RDEPENDS:${PN} += "rocq"

inherit rpm
