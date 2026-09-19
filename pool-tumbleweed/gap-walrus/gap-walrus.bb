SUMMARY = "GAP: Proving assistant for hyperbolicity"
DESCRIPTION = "An implementation of hyperbolicity testing using an idea by Holt, \
Neunhöffer, Parker and Roney-Dougal."
LICENSE = "BSD-3-Clause"

PV = "0.9992"

RPM_NAME = "gap-walrus-0.9992-1.2.noarch.rpm"
RPM_HASH = "503d6603ae9d9ced62d52356ac2ae790a36f89606757bef7db0322aa7d676187214342056922e755fd9c62dc81c6566e8f780cfb8aa62a30341a785e6e862c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-walrus"

RDEPENDS:${PN} += "gap-core \
gap-datastructures \
gap-digraphs \
gap-gapdoc"

inherit rpm
