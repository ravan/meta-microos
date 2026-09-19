SUMMARY = "Java-based XML parser (documentation)"
DESCRIPTION = "Javadoc for aelfred."
LICENSE = "BSD-3-Clause"

PV = "7.0"

RPM_NAME = "aelfred-javadoc-7.0-10.9.noarch.rpm"
RPM_HASH = "176db31ae675be288cdcbcd7c072340e02d98fddfa33d3c37514f072bcfb2a38ce0587afdc5c093c0cdbab34112b8c89f5c14b5a81a49608d9817ba6d3f929f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aelfred-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
