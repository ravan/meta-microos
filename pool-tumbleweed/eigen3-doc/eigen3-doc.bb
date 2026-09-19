SUMMARY = "Documentation for the Eigen3 C++ Template Library for Linear Algebra"
DESCRIPTION = "Documentation in HTML format for the Eigen3 C++ Template Library \
for Linear Algebra"
LICENSE = "BSD-3-Clause & LGPL-2.1-only & MPL-2.0 & LGPL-2.1-or-later"

PV = "5.0.1"

RPM_NAME = "eigen3-doc-5.0.1-1.3.noarch.rpm"
RPM_HASH = "3b7ae3f2ed3c23488bd8cd766805d0de35c6ddea697335fd021fe4f270b4b9e0ce76517d9290a8a09f34341888b16758b93a7b22e3c9f1979d8b0cc9a6402050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eigen3-doc"

RDEPENDS:${PN} += ""

inherit rpm
