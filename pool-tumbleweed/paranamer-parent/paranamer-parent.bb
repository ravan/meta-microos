SUMMARY = "ParaNamer Parent POM"
DESCRIPTION = "This package contains the ParaNamer Parent POM."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-parent-2.8-4.10.noarch.rpm"
RPM_HASH = "6230f820f9efacd892912329a46abb685f4f50329a404b69ffca61a612d464b3be407c08b1fcff7472576aa5736155a3649efb26aa57306fa58f69361f1aaa4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-parent-pom- \
paranamer-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin"

inherit rpm
