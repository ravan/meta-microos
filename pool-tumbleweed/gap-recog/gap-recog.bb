SUMMARY = "GAP: A collection of group recognition methods"
DESCRIPTION = "This packages contains a collection of methods for the constructive \
recognition of groups. It is mostly intended for permutation groups, \
matrix groups and projective groups."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "gap-recog-1.5.1-1.2.noarch.rpm"
RPM_HASH = "b571c4b1ec9ff83d0b50aac8d35759a3434b6ee68ac1330837396c70054b660f7fbf2ed510f16c388a306c3aed3f9245b78abba9883875f53684f558fa39a78e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-recog"

RDEPENDS:${PN} += "/usr/bin/python3 \
gap-atlasrep \
gap-core \
gap-factint \
gap-forms \
gap-genss \
gap-orb"

inherit rpm
