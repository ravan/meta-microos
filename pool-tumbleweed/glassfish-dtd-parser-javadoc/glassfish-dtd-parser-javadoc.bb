SUMMARY = "Javadoc for glassfish-dtd-parser"
DESCRIPTION = "This package contains javadoc for glassfish-dtd-parser."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.4"

RPM_NAME = "glassfish-dtd-parser-javadoc-1.4-7.7.noarch.rpm"
RPM_HASH = "5adce3052f4f2b26444807ceeea244ac04782df9f913b8098a60688586054653ea0a5b460127bc53abb0608450e1d47375cba54e7fdafc645d7045fd8e8df700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-dtd-parser-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
