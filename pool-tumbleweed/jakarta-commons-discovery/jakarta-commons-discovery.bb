SUMMARY = "Jakarta Commons Discovery"
DESCRIPTION = "The Discovery component is about discovering, or finding, \
implementations for pluggable interfaces.  Pluggable interfaces are \
specified with the intent that multiple implementations are, or will \
be, available to provide the service described by the interface. \
Discovery provides facilities for finding and instantiating classes and \
for lifecycle management of singleton (factory) classes."
LICENSE = "Apache-2.0"

PV = "0.5"

RPM_NAME = "jakarta-commons-discovery-0.5-2.7.noarch.rpm"
RPM_HASH = "fd9500ce4f604143d569e44c0a7eb8c4fbf772cd223508c25af41393fa8663a43198676799dd39e80abe7cb7fb4964f5929b05affa2e0097e98e20cb16bfce73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commons-discovery \
jakarta-commons-discovery \
mvn-commons-discovery-commons-discovery \
mvn-commons-discovery-commons-discovery-pom- \
osgi-org.apache.commons.discovery"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm
