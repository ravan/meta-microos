SUMMARY = "Javadoc for jsonp"
DESCRIPTION = "This package contains javadoc for jsonp."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.1.4"

RPM_NAME = "jsonp-javadoc-1.1.4-1.6.noarch.rpm"
RPM_HASH = "8f5244d763cfaedbf42d0923df47a67d0716e8a4b3fed2bdf9386d1a59ff3de433ee0c637618dd73a4cb06cf339b2452599829a2b6a37b3ffa99603502bd9b18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsonp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
