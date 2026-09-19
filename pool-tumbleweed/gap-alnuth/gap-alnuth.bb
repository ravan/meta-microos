SUMMARY = "GAP: Algebraic number theory and an interface to KANT"
DESCRIPTION = "The Alnuth package provides various methods to compute with number \
fields which are given by a defining polynomial or by generators. The \
main methods included in Alnuth are: creating a number field, \
computing its maximal order, computing its unit group and a \
presentation of this unit group, computing the elements of a given \
norm of the number field, determining a presentation for a finitely \
generated multiplicative subgroup, and factoring polynomials defined \
over number fields."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.2"

RPM_NAME = "gap-alnuth-4.0.2-1.2.noarch.rpm"
RPM_HASH = "fd9a1ec62e324ab9680e27b9e2451904160b1839429b7733b6ce5500ecd00efb9477749716acebcf95db64aa2b20cf208fa9970e029840f5441e7c82440892fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-alnuth"

RDEPENDS:${PN} += "gap-core \
gap-polycyclic \
pari-gp"

inherit rpm
