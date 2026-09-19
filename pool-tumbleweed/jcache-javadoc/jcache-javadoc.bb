SUMMARY = "API documentation for jcache"
DESCRIPTION = "API documentation for jcache."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "jcache-javadoc-1.1.1-2.4.noarch.rpm"
RPM_HASH = "ca6dd0c05d3550da145ea0738d99e94194114f5bf723acbf6e6a0aa451629b0416c8237141320385e5c0bacb67c9e4bf1e8cf9a717d5cc87fcb6f8534a37c528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcache-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
