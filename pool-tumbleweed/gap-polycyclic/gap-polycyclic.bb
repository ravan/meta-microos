SUMMARY = "GAP: Computation with polycyclic groups"
DESCRIPTION = "The Polycyclic package provides a basis for working with polycyclic \
groups defined by polycyclic presentations. \
 \
The features of this package include \
 \
* creating a polycyclic group from a polycyclic presentation \
* arithmetic in a polycyclic group \
* computation with subgroups and factor groups of a polycyclic group \
* computation of standard subgroup series such as the derived series, \
  the lower central series \
* computation of the first and second cohomology \
* computation of group extensions \
* computation of normalizers and centralizers \
* solutions to the conjugacy problems for elements and subgroups \
* computation of Torsion and various finite subgroups \
* computation of various subgroups of finite index \
* computation of teh Schur multiplicator, the non-abelian exterior \
  square and the non-abelian tenor square"
LICENSE = "GPL-2.0-or-later"

PV = "2.18"

RPM_NAME = "gap-polycyclic-2.18-1.2.noarch.rpm"
RPM_HASH = "30586764629cbfda2fe25588e307578df52399d7cd0695b75cb1324c9cb1fb295452964d885d14900f5e7d5e4e36ec9536e9b2d09b686bbcf8df4c7f59d95af0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-polycyclic"

RDEPENDS:${PN} += "gap-alnuth \
gap-autpgrp \
gap-core"

inherit rpm
