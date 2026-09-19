SUMMARY = "Javadoc for wsdl4j"
DESCRIPTION = "The Web Services Description Language for Java Toolkit (WSDL4J) allows \
the creation, representation, and manipulation of WSDL documents \
describing services.  This codebase will eventually serve as a \
reference implementation of the standard created by JSR110. \
 \
This package contains the javadoc documentation for the Web Services \
Description Language for Java."
LICENSE = "CPL-1.0"

PV = "1.6.3"

RPM_NAME = "wsdl4j-javadoc-1.6.3-14.6.noarch.rpm"
RPM_HASH = "2ff7723dc65a07db8bff036ede5693061b0f470e94a21a96ecfc7dba0ec84cd87a133489f88f5bccb51a9e387a6f706e276e3404937c96caa06ef2a240078432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wsdl4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
