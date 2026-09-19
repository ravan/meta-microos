SUMMARY = "Proof Assistant based on the Calculus of Inductive Constructions"
DESCRIPTION = "Proof assistant which allows to handle calculus assertions, check mechanically \
proofs of these assertions, helps to find formal proofs and extracts a certified \
program from the constructive proof of its formal specification. \
 \
This package contains shared files and the command line interface. \
For a graphical interface install rocq-ide."
LICENSE = "LGPL-2.1-only"

PV = "9.2.0"

RPM_NAME = "rocq-9.2.0-2.1.aarch64.rpm"
RPM_HASH = "ce6b8ec1ee8ce294d8cf50eb5d7444bfd06dcbec310b752e90d1c116d2cad1557bbee517b53e033b378b3319236412843921ea01c99740d79d7f69bcb2b05746"

RPROVIDES:${PN} += "coq \
rocq"

RDEPENDS:${PN} += "/usr/bin/ocamlrun-a100 \
/usr/bin/python3 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
