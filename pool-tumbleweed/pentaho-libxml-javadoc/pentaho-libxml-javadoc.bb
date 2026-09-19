SUMMARY = "Javadoc for pentaho-libxml"
DESCRIPTION = "Javadoc for pentaho-libxml."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "pentaho-libxml-javadoc-1.1.6-2.8.noarch.rpm"
RPM_HASH = "3b1100cd36de298ece175ce41d5de36daae6976938b6d011e02e798b7d56b8a9f46d8093122722e9773cec54de65587f410d961919b1ca00c0ac828d1900db1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-libxml-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
