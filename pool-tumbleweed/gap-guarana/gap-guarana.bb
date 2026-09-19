SUMMARY = "GAP: Lie methods for computations with infinite polycyclic groups"
DESCRIPTION = "This package demonstrates the algorithmic usefulness of the so-called \
Mal'cev correspondence for computations with infinite polycyclic \
groups; it is a correspondence that associates to every $\\Q$-powered \
nilpotent group $H$ a unique rational nilpotent Lie algebra $L_H$ and \
vice-versa. The Mal'cev correspondence was discovered by Anatoly \
Mal'cev in 1951."
LICENSE = "GPL-2.0-or-later"

PV = "0.96.3"

RPM_NAME = "gap-guarana-0.96.3-1.9.noarch.rpm"
RPM_HASH = "0e56b7e411216bf52b191e694e16999fe6487f915772f8ffbf3de884020cb6db057da600d1f7f6f5d86fad4c1b008a12485c03bed83aa6989c0f08a1642d5fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-guarana"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-polenta \
gap-polycyclic \
gap-radiroot"

inherit rpm
