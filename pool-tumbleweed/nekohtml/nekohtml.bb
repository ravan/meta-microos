SUMMARY = "HTML scanner and tag balancer"
DESCRIPTION = "NekoHTML is a simple HTML scanner and tag balancer that enables \
application programmers to parse HTML documents and access the \
information using standard XML interfaces. The parser can scan HTML \
files and 'fix up' many common mistakes that human (and computer) \
authors make in writing HTML documents.  NekoHTML adds missing parent \
elements; automatically closes elements with optional end tags; and \
can handle mismatched inline element tags. \
NekoHTML is written using the Xerces Native Interface (XNI) that is \
the foundation of the Xerces2 implementation. This enables you to use \
the NekoHTML parser with existing XNI tools without modification or \
rewriting code."
LICENSE = "Apache-2.0"

PV = "1.9.22.noko2"

RPM_NAME = "nekohtml-1.9.22.noko2-2.12.noarch.rpm"
RPM_HASH = "c02523eafd10db293f6876b0bef000d7ca46f2d44c878dd756ccdf14f4d3cc00cd51baa228d5deb1ebfb930a10d3a7ff688f41577c3c937c5b98c8db59379e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-nekohtml-nekohtml \
mvn-nekohtml-nekohtml-pom- \
mvn-net.sourceforge.nekohtml-nekohtml \
mvn-net.sourceforge.nekohtml-nekohtml-pom- \
mvn-net.sourceforge.nekohtml-nekohtml-xni \
nekohtml \
osgi-org.cyberneko.html"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-xerces-xercesImpl \
xerces-j2"

inherit rpm
