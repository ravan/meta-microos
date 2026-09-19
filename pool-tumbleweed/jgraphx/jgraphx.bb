SUMMARY = "Java-based Diagram Component and Editor"
DESCRIPTION = "Jgraphx is the a lightweight and feature-rich graph component for Java, \
and the successor to jgraph. It provides automatic 2D layout and routing \
for diagrams. Object and relations can be displayed in any Swing UI \
via provided zoomable component."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "jgraphx-4.2.2-3.8.noarch.rpm"
RPM_HASH = "160ae0b915d9d90ea0f80960422f4062e31a15260b8339f7667002dbff9fb0f639194b771ddf72aed2547e67e82329f91111cd5dbe513e82c84c45fea60d5513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgraphx \
mvn-com.mxgraph-jgraphx \
mvn-com.mxgraph-jgraphx-pom- \
osgi-com.mxgraph"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
