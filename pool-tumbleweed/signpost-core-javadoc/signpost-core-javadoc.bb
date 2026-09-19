SUMMARY = "Javadoc for signpost-core"
DESCRIPTION = "This package contains the API documentation for signpost-core."
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "signpost-core-javadoc-1.2.1.2-3.20.noarch.rpm"
RPM_HASH = "8efc2898b8240c4c3bf40557f7b838ff9b8b57559c93b550f31f72a9a5da44568c3cbbcff3ab6cce94866bdd42f3308ed82a8887d0d0edfe306c532ed4cefc1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "signpost-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
