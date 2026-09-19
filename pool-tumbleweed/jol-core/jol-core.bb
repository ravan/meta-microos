SUMMARY = "Java Object Layout core classes"
DESCRIPTION = "JOL (Java Object Layout) is a tiny toolbox to analyze Java object \
layouts.  These tools use Unsafe, JVMTI, and Serviceability Agent (SA) \
heavily to decode the actual object layout, footprint, and references. \
This makes JOL much more accurate than other tools relying on heap dumps, \
specification assumptions, etc. \
 \
This package contains the core classes for JOL."
LICENSE = "GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "0.17"

RPM_NAME = "jol-core-0.17-1.10.noarch.rpm"
RPM_HASH = "2f30be02a0b2cca32ec3fc18db114e1c4aee2acea1be943393330d089ac1d0c7e865eb1712e2dc055fa81b1c0908d04274ca6320a3410a4ca3d0a83a29187d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jol-core \
mvn-org.openjdk.jol-jol-core \
mvn-org.openjdk.jol-jol-core-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
