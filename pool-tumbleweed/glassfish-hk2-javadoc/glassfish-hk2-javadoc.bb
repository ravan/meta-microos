SUMMARY = "Javadoc for glassfish-hk2"
DESCRIPTION = "This package contains API documentation for glassfish-hk2."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-javadoc-2.5.0-11.6.noarch.rpm"
RPM_HASH = "8fd43220c6d841bc6a3b111bd5aa6e61b2fbec1e072b170aebd74d3f3e1274f07542b478ff76f30b06448c5c8d96886ac22e6e413a2c227eb89ecaed21837148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
