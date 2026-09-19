SUMMARY = "GAP: The crystallographic groups catalog"
DESCRIPTION = "CrystCat provides a catalog of crystallographic groups of dimensions \
2, 3, and 4, which covers most of the data contained in the book \
'Crystallographic groups of four-dimensional space' by H. Brown, R. \
Bülow, J. Neubüser, H. Wondratschek, and H. Zassenhaus (John Wiley, \
New York, 1978)."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.13"

RPM_NAME = "gap-crystcat-1.1.13-1.1.noarch.rpm"
RPM_HASH = "971ab40ed642e5b77e6fc29a712daf4042bdf781d94fe71641430ecc0c0be4d25b8e44c0907b1cc55b276548d5c057e933510e4651f647f28559f09d3e3fafe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-crystcat"

RDEPENDS:${PN} += "gap-core \
gap-cryst"

inherit rpm
