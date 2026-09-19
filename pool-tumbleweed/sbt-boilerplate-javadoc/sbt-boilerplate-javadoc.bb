SUMMARY = "Javadoc for sbt-boilerplate"
DESCRIPTION = "This package contains javadoc for sbt-boilerplate."
LICENSE = "BSD-2-Clause"

PV = "0.6.1"

RPM_NAME = "sbt-boilerplate-javadoc-0.6.1-3.7.noarch.rpm"
RPM_HASH = "466c8ec5758be191aba8a459674e2a6d5990dacc7f1304507a89f21013ceb113d66bda71686bc17c05c6615008e583233f5ad1a75766be8f81671eae335a7de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sbt-boilerplate-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
