SUMMARY = "Java library providing parsing of input text based on PEGs"
DESCRIPTION = " \
 \
 \
 \
parboiled is a mixed Java library providing parsing of \
arbitrary input text based on Parsing expression grammars (PEGs). \
PEGs are an alternative to context free grammars (CFGs) for formally \
specifying syntax, they make a replacement for regular expressions \
and generally have some advantages over the 'traditional' way of \
building parser via CFGs."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "parboiled-1.4.1-4.9.noarch.rpm"
RPM_HASH = "6228c3088067a2d404437ca55409807889dc9a3bc135014176b1c186592a994bc9ece6a3bd5e072a78c07bb88ee52bd7ce413b7ffd661e08b0d3141b2b09f170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.parboiled-parboiled-core \
mvn-org.parboiled-parboiled-core-pom- \
mvn-org.parboiled-parboiled-java \
mvn-org.parboiled-parboiled-java-pom- \
osgi-org.parboiled.core \
osgi-org.parboiled.java \
parboiled"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-analysis \
mvn-org.ow2.asm-asm-tree \
mvn-org.ow2.asm-asm-util"

inherit rpm
