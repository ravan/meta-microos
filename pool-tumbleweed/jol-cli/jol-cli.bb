SUMMARY = "Java Object Layout command line interface"
DESCRIPTION = "JOL (Java Object Layout) is a tiny toolbox to analyze Java object \
layouts.  These tools use Unsafe, JVMTI, and Serviceability Agent (SA) \
heavily to decode the actual object layout, footprint, and references. \
This makes JOL much more accurate than other tools relying on heap dumps, \
specification assumptions, etc. \
 \
This package contains a command line interface to JOL."
LICENSE = "GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "0.17"

RPM_NAME = "jol-cli-0.17-1.10.noarch.rpm"
RPM_HASH = "6f96d2381bf4def8aa2fa2d0c27685c4dd50ccb432097e05faf48da175f748770919e74226d6174bc3809f0382b187183303a2f4d026bc8cbabf7bc13979c800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jol-cli \
mvn-org.openjdk.jol-jol-cli \
mvn-org.openjdk.jol-jol-cli-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jol-core \
mvn-net.sf.jopt-simple-jopt-simple \
mvn-org.openjdk.jol-jol-core"

inherit rpm
