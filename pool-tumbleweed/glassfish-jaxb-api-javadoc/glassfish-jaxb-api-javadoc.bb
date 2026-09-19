SUMMARY = "Javadoc for jaxb-spec"
DESCRIPTION = "Glassfish - JAXB (JSR 222) API. \
 \
This package contains javadoc for glassfish-jaxb-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.4.0"

RPM_NAME = "glassfish-jaxb-api-javadoc-2.4.0-7.9.noarch.rpm"
RPM_HASH = "daf5c2f19ca7c4972e46888999ad128466ec8f47ea81d1014f067e36386d54db72d07f6d92bf8761783e412ca988df97eb92bcbab2798950f78b81f8a2cce125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
