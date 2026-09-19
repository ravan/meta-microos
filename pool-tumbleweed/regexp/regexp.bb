SUMMARY = "Simple regular expressions API"
DESCRIPTION = "Regexp is a 100% Pure Java Regular Expression package that was \
graciously donated to the Apache Software Foundation by Jonathan Locke. \
He originally wrote this software back in 1996 and it has stood up \
quite well to the test of time. It includes complete Javadoc \
documentation as well as a simple Applet for visual debugging and \
testing suite for compatibility."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "regexp-1.5-24.8.noarch.rpm"
RPM_HASH = "35084ac8754aa8cd4846ad49a578ccb5ef3502765c455cc3969c80ff5be7820a9282fcc94b1f01779020b753f395b0b20782c1a8492e6106455501c6508fbc3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-jakarta-regexp-jakarta-regexp \
mvn-jakarta-regexp-jakarta-regexp-pom- \
mvn-regexp-regexp \
mvn-regexp-regexp-pom- \
regexp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
