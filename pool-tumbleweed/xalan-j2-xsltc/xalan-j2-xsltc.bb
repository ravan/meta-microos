SUMMARY = "Java XSLT compiler"
DESCRIPTION = "The XSLT Compiler is a Java-based tool for compiling XSLT stylesheets \
into lightweight and portable Java byte codes called translets."
LICENSE = "Apache-2.0"

PV = "2.7.3"

RPM_NAME = "xalan-j2-xsltc-2.7.3-4.6.noarch.rpm"
RPM_HASH = "97dbee3fb29e56b39ed57121982d80770309b2bc8114763ef663f237bd6372ab36fd2dde960ab241910918312fdf3028f34116864a6482d8fbf7865972669c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-xalan-xsltc \
mvn-xalan-xsltc-pom- \
xalan-j2-xsltc"

RDEPENDS:${PN} += "bcel \
java-cup \
java-headless \
javapackages-filesystem \
jlex \
mvn-xalan-xalan \
regexp \
xerces-j2"

inherit rpm
