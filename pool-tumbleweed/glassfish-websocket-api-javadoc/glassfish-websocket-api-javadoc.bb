SUMMARY = "Javadoc for glassfish-websocket-api"
DESCRIPTION = "This package contains javadoc for glassfish-websocket-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.1"

RPM_NAME = "glassfish-websocket-api-javadoc-1.1-4.4.noarch.rpm"
RPM_HASH = "6c71f251c16954295e2f0a9838a01a7e360bc5c468205895f22fcb89aacd98368a6aabb4b5c2105e3af0e72a274b98fa6f9ff7e3bc20aebe9994e36612968ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-websocket-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
