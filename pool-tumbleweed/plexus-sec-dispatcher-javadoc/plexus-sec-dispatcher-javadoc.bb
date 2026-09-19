SUMMARY = "Javadoc for plexus-sec-dispatcher"
DESCRIPTION = "API documentation for plexus-sec-dispatcher."
LICENSE = "Apache-2.0"

PV = "2.0"

RPM_NAME = "plexus-sec-dispatcher-javadoc-2.0-8.5.noarch.rpm"
RPM_HASH = "988ce361c1c3471ac7d213bfd2d602d95316113735482c6056ea13af03b6dd6722cfa902b057b6d47a52815e7d624cd1382bb73d670e81b69e73b85f5bdc3275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-sec-dispatcher-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
