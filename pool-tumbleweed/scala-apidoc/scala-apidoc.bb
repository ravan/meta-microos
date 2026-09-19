SUMMARY = "Documentation for the Scala programming language"
DESCRIPTION = "This package provides reference and API documentation for the Scala \
programming language."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "2.13.12"

RPM_NAME = "scala-apidoc-2.13.12-3.2.noarch.rpm"
RPM_HASH = "452a6b5e248ea75ba49a9a01ca174d105a7c9b9103dba955f25f337c85a3711d6fa3d3080d8875a0c05cae7e3d009f30bfdf9d0bf54e367611e2b95ead3aaad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scala-apidoc"

RDEPENDS:${PN} += ""

inherit rpm
