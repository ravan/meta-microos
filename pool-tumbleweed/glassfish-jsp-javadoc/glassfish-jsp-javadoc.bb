SUMMARY = "API documentation for glassfish-jsp"
DESCRIPTION = "API documentation for glassfish-jsp."
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.3.4"

RPM_NAME = "glassfish-jsp-javadoc-2.3.4-7.5.noarch.rpm"
RPM_HASH = "772b9c1ca7560a6b4a6bae3237ada3421d3083795d914912e9177483b04ef1bd11d1ed545ea3790b1665596cbf23241b04f882fb0ccb9bad3db1a0fe376b21ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
