SUMMARY = "API documentation for mchange-commons"
DESCRIPTION = "API documentation for mchange-commons."
LICENSE = "EPL-1.0 | LGPL-2.0-only"

PV = "0.6.1"

RPM_NAME = "mchange-commons-javadoc-0.6.1-1.2.noarch.rpm"
RPM_HASH = "4c9ccfcd5e3cae0e90b43a4e8146a38a5a8476b5f79117270d92818459ec3e00c0f51371dcac7b7364123ed5829c7f994095f8811952c5fb1f755b9d74d98dfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mchange-commons-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
