SUMMARY = "GAP: Database and algorithms for Lie p-rings"
DESCRIPTION = "LiePRing is a GAP4 package for access to the nilpotent Lie rings of \
order p^n for p>2 and n<=7."
LICENSE = "GPL-2.0-only"

PV = "2.9.3"

RPM_NAME = "gap-liepring-2.9.3-1.1.noarch.rpm"
RPM_HASH = "00e67ea17831a124d4368d153df098ab206c251c97e562510b77ee7b2252e2ebf8ddf8b0635fa077c49b710f61453d56474ae692431a0f0ca037073eedd463ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-liepring"

RDEPENDS:${PN} += "gap-core \
gap-liering"

inherit rpm
