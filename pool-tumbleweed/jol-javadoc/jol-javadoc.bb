SUMMARY = "Javadoc for Java Object Layout"
DESCRIPTION = "JOL (Java Object Layout) is a tiny toolbox to analyze Java object \
layouts.  These tools use Unsafe, JVMTI, and Serviceability Agent (SA) \
heavily to decode the actual object layout, footprint, and references. \
This makes JOL much more accurate than other tools relying on heap dumps, \
specification assumptions, etc. \
 \
This package contains the API documentation for JOL."
LICENSE = "GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "0.17"

RPM_NAME = "jol-javadoc-0.17-1.10.noarch.rpm"
RPM_HASH = "0829721bfd47540c188746ac2ed2a9970c06ef33c9c9be54a432f539bb80751b6788e2728ea16275fb8f3121598f7a78231ffb06691dd687a408becca94fa729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jol-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
