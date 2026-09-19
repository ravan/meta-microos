SUMMARY = "An embeddable pure Java syntax highlighting library"
DESCRIPTION = "JHighlight is an embeddable pure Java syntax highlighting library that supports \
Java, Groovy, C++, HTML, XHTML, XML and LZX languages and outputs to XHTML. It \
also supports RIFE (http://rifers.org) templates tags and highlights them \
clearly so that you can easily identify the difference between your RIFE markup \
and the actual marked up source."
LICENSE = "CDDL-1.0 | LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "jhighlight-1.0.1-3.8.noarch.rpm"
RPM_HASH = "7ec6c0057eddec4012121d3e561418566333fd6edeb12575b469e24c08b83341df4003e242b8cca61a6b75e36a3695487b3385fae55f91e7ba4d8eec51b0ece1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jhighlight \
mvn-com.uwyn-jhighlight \
mvn-com.uwyn-jhighlight-pom- \
mvn-org.codelibs-jhighlight \
mvn-org.codelibs-jhighlight-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
