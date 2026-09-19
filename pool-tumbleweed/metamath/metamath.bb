SUMMARY = "Formal proof verifier and proof assistant"
DESCRIPTION = "The Metamath language is a language to write theorems and formal proofs for \
them. The Metamath program can parse files in the Metamath language and verify \
the proofs. You can find examples of theories developed in Metamath on the \
website."
LICENSE = "GPL-2.0-or-later"

PV = "0.198"

RPM_NAME = "metamath-0.198-7.17.aarch64.rpm"
RPM_HASH = "8926062483bfed43fafcd11f04fe85cdcdbba4386d1c19136770396c4ceedff0f56ae5f38ca0c0139630d5b262199d20c2d0dce77f1594b77c4eb703ca5c6453"

RPROVIDES:${PN} += "metamath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
