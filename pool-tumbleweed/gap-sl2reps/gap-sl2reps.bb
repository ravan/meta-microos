SUMMARY = "GAP: Construction of symmetric representations of SL(2,Z)"
DESCRIPTION = "The SL2Reps GAP package provides provides methods for constructing and testing \
matrix presentations of the representations of SL(2,Z) whose kernels are \
congruence subgroups of SL(2,Z)."
LICENSE = "GPL-2.0+"

PV = "1.1"

RPM_NAME = "gap-sl2reps-1.1-1.9.noarch.rpm"
RPM_HASH = "27d3ba4084098cd88407485f2f9d5936410e895e02e8596b9d3946af961752350a4f77e79384cc7610fa3109b489fe3b8cef0e92fa08f8f153d8b360b29f17bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-sl2reps"

RDEPENDS:${PN} += "gap-core"

inherit rpm
