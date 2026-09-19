SUMMARY = "Javadoc for jboss-interceptors-1.2-api"
DESCRIPTION = "This package contains javadoc for jboss-interceptors-1.2-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.1"

RPM_NAME = "jboss-interceptors-1.2-api-javadoc-1.0.1-2.8.noarch.rpm"
RPM_HASH = "e54d83c8c4881859d470da32f3bdd86fe3e79c438e3279eeb02ce9fe725107223df5ceffa16d5930a46793627525b5a9a4ee6fbdce12c2f3e4825169fbcffb91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-interceptors-1.2-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
