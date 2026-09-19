SUMMARY = "Demo for nekohtml"
DESCRIPTION = "Demonstrations and samples for nekohtml."
LICENSE = "Apache-2.0"

PV = "1.9.22.noko2"

RPM_NAME = "nekohtml-demo-1.9.22.noko2-2.12.noarch.rpm"
RPM_HASH = "28afa8f24c4321e44c36fabfec30a68c603077a050494676d3a823dd7a3b0aba4b10b6b1b01a5cbb4f4735ee05df81ad93c80d2f15f00a0c246aac60eb601ed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sourceforge.nekohtml-nekohtml-samples \
nekohtml-demo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
nekohtml"

inherit rpm
