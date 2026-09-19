SUMMARY = "GAP: Free Group Algorithms"
DESCRIPTION = "The FGA package provides methods for computations with finitely \
generated subgroups of free groups. \
 \
It allows you to (constructively) test membership and conjugacy, and \
to compute free generators, the rank, the index, normalizers, \
centralizers, and intersections where the groups involved are \
finitely generated subgroups of free groups. \
 \
In addition, it provides generators and a finite presentation for the \
automorphism group of a finitely generated free group and allows to \
write any such automorphism as word in these generators."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.0"

RPM_NAME = "gap-fga-1.5.0-1.7.noarch.rpm"
RPM_HASH = "4fbca0c464874f1e29938b880aa20f42c02592c3b7650bf4879fc50cc1693b801eaf466beebf7581e4ec03c9901b45184ee2014086b3e6d3ae0c54858f6a5489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-fga"

RDEPENDS:${PN} += "gap-core"

inherit rpm
