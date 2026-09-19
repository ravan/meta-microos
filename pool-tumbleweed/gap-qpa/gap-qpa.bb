SUMMARY = "GAP: Quivers and Path Algebras"
DESCRIPTION = "The QPA package provides data structures and algorithms for doing \
computations with finite dimensional quotients of path algebras, and \
finitely generated modules over such algebras. The current version of \
the QPA package has data structures for quivers, quotients of path \
algebras, and modules, homomorphisms and complexes of modules over \
quotients of path algebras."
LICENSE = "GPL-2.0-only"

PV = "1.37"

RPM_NAME = "gap-qpa-1.37-1.2.noarch.rpm"
RPM_HASH = "a08019f8181a9ac737efeb1606b51a3d15c897d34cb995ed3ea3810f7dbbffbbfaf292cddf89e66c50dcb194f4315c583dc927d12dece13109ec558306765d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-qpa"

RDEPENDS:${PN} += "/usr/bin/bash \
gap-core \
gap-gbnp"

inherit rpm
