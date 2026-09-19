SUMMARY = "GAP: Residue-Class-Wise Affine Groups"
DESCRIPTION = "This package for GAP 4 introduces a new class of groups which are \
accessible to computational methods. In principle, it can deal at \
least with the follo- wing types of groups: \
 \
* Finite groups. \
* Free groups of finite rank. \
* Free products of finitely many finite groups, thus in particular \
  the modular group PSL(2,Z). \
* Direct products of such groups. \
* Wreath products of such groups with finite groups and with (Z,+). \
 \
Among these groups there are finitely generated groups which are not \
finitely presented, and such with unsolvable membership problem. \
Further, any finite group embeds into some divisible torsion group \
which RCWA can deal with."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "gap-rcwa-4.10.1-1.1.noarch.rpm"
RPM_HASH = "a01a9c72f13cbc4aeb03a087f54c35699d40bbe5ec5ff28f2d5988128f39f9e897ac3ab0c385867a20dfac081bfb238efa2d66bd3fc33eb623d83037550c6435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-rcwa"

RDEPENDS:${PN} += "gap-core \
gap-fr \
gap-gapdoc \
gap-grape \
gap-polycyclic \
gap-resclasses \
gap-utils"

inherit rpm
