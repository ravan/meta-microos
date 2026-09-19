SUMMARY = "GAP: Algorithm for enumerating all difference sets in a group"
DESCRIPTION = "The DifSets package is a GAP package implementing an algorithm for \
enumerating all difference sets up to equivalence in a group."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.1"

RPM_NAME = "gap-difsets-2.3.1-1.9.noarch.rpm"
RPM_HASH = "dc17941b8086a96675ab7faa709cc9350ad381690d39dcbd45a4181b35ab33189c8a56771876f233af5cfd88983c356cbc47de23a1f1b254dde9a583385937ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-difsets"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
gap-grape"

inherit rpm
