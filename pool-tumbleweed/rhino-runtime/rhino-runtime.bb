SUMMARY = "Rhino Runtime"
DESCRIPTION = "Rhino JavaScript runtime jar, excludes tools & JSR-223 Script Engine wrapper."
LICENSE = "MPL-2.0"

PV = "1.7.15.1"

RPM_NAME = "rhino-runtime-1.7.15.1-1.5.noarch.rpm"
RPM_HASH = "f6903dec421c865a9a764c250e4888d1324d048ea9b74a90262e85431a24f4d433e7ad7fc8b0e210acbbc392523d7c1333e2c26b52054db19fb8c3fc0243833b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.mozilla-rhino-runtime \
mvn-org.mozilla-rhino-runtime-pom- \
osgi-org.mozilla.rhino-runtime \
rhino-runtime"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
