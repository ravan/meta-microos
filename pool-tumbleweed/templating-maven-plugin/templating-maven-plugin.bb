SUMMARY = "Templating Maven Plugin"
DESCRIPTION = "The Templating Maven Plugin handles copying files from a source to a given \
output directory, while filtering them. This plugin is useful to filter Java \
Source Code if you need for example to have things in that code replaced with \
some properties values."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "templating-maven-plugin-3.0.0-1.6.noarch.rpm"
RPM_HASH = "1de1fdc23e1cfbb6a32faa6d0c2bd84eafc57058f5712b19ad1ede9874e11009169360a436522f397497c470eb931aa2c6ae146b2d54b7c0cae508467498f5d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.mojo-templating-maven-plugin \
mvn-org.codehaus.mojo-templating-maven-plugin-pom- \
templating-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.codehaus.plexus-plexus-interpolation"

inherit rpm
