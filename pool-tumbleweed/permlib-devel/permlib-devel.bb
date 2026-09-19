SUMMARY = "Header files for permlib, a permutation computation library"
DESCRIPTION = "PermLib is a C++ library for permutation computations. It is \
implemented in C++ header files only. \
 \
Currently, it supports set stabilizer and in-orbit computations, \
based on bases and strong generating sets (BSGS). Additionally, it \
computes automorphisms of symmetric matrices and find the \
lexicographically smallest set in an orbit of sets. It also features \
a very basic recognition of permutation group types."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "permlib-devel-0.2.9-1.18.noarch.rpm"
RPM_HASH = "12050fff10ab6ac9856d12eb2f1a81e29de63936a53e353e3b933ec5ddfaec9c9d4502bbadfc467165f1d24decf74a238690114d27d851570410c942c2dd69e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "permlib-devel"

RDEPENDS:${PN} += "libboost-headers-devel"

inherit rpm
