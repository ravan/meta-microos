SUMMARY = "API documentation for spotbugs"
DESCRIPTION = "API documentation for spotbugs."
LICENSE = "LGPL-2.1-only"

PV = "4.9.8"

RPM_NAME = "spotbugs-javadoc-4.9.8-1.2.noarch.rpm"
RPM_HASH = "7af933e43ad14ed1043423841e5a8576ac7172e86ab581a84593663a8a15039884f817b84b6b94fbffda178da71accb330e758b34c7e79e981706b4000861200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spotbugs-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
