SUMMARY = "Simple, efficient iterators for OCaml"
DESCRIPTION = "Iterators for OCaml, both restartable and consumable. \
The implementation keeps a good balance between simplicity and performance."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ocaml-gen-1.1-3.1.aarch64.rpm"
RPM_HASH = "e3a128b99e358aaf0627d6e91aa1c1f4025239d45b43c0cb14561a94087395efb9c2c495a935d57fa59a15a944fdef586d584daca4a5afac22b85fb536497904"

RPROVIDES:${PN} += "ocaml-gen"

RDEPENDS:${PN} += ""

inherit rpm
