SUMMARY = "Documentation for NTL, a number theory library"
DESCRIPTION = "NTL is a C++ library providing data structures and algorithms for \
manipulating signed, arbitrary length integers, and for vectors, \
matrices, and polynomials over the integers and over finite fields. \
 \
This package contains the documentation for the NTL API."
LICENSE = "LGPL-2.1-or-later"

PV = "11.6.0"

RPM_NAME = "ntl-doc-11.6.0-1.4.noarch.rpm"
RPM_HASH = "45fc6f6a1bddabf29e146433feb50e173fe647e02ce15f957d333d02a23f273fe55206275e5715954587f5c9bfcda3510075f9ea905d851e7028452e89780002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ntl-doc"

RDEPENDS:${PN} += ""

inherit rpm
