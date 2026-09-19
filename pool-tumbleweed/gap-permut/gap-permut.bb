SUMMARY = "GAP: Permutability in finite groups"
DESCRIPTION = "This package provides functions for computing with permutability in \
finite groups."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.6"

RPM_NAME = "gap-permut-2.0.6-1.1.noarch.rpm"
RPM_HASH = "b859760453d4d890660a8518a431baadcafd207ae98ba877037add1071dcf49b2b9c3bb798ac36a6bc3b32f5fa3807fe66f3e4bb6305956e7834d8341fb8b924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-permut"

RDEPENDS:${PN} += "gap-core \
gap-format"

inherit rpm
