SUMMARY = "Maven plugin that generates files based on grammar file(s)"
DESCRIPTION = "The Antlr Plugin has two goals: \
- antlr:generate Generates file(s) to a target directory based on grammar \
  file(s). \
- antlr:html Generates Antlr report for grammar file(s)."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "antlr-maven-plugin-2.2-10.6.noarch.rpm"
RPM_HASH = "0531c90edf48f01c3bf7aec0204370d67eaaefcc30f879d157ce0931ac6415c8a2b2e5d9ef8595ae6e235526287cae339b62c277233eee4fd69e4d8e77d2adea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr-maven-plugin \
mvn-org.codehaus.mojo-antlr-maven-plugin \
mvn-org.codehaus.mojo-antlr-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-exec \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-i18n \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
