SUMMARY = "GAP: Frobenius normal form"
DESCRIPTION = "This package computes the Frobenius normal form and the \
Jordan—Chevalley decomposition of a (square) matrix over any field \
that is available in GAP. It also computes the Jordan normal form of \
matrices over finite fields."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "gap-nofoma-1.0.1-1.1.noarch.rpm"
RPM_HASH = "06fcd3f311d0196dca0759b44446c64dc5e26b0ca2c8f5aa7a1f9667b3f0c34f02dd9cedf3a3113521e3638c1401d1ad089a270b8d489ce9d8946eb54950d7c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-nofoma"

RDEPENDS:${PN} += "gap-core \
gap-sonata"

inherit rpm
