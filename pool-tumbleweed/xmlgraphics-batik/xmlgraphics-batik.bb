SUMMARY = "Scalable Vector Graphics for Java"
DESCRIPTION = "Batik is a Java(tm) technology based toolkit for applications that want \
to use images in the Scalable Vector Graphics (SVG) format for various \
purposes, such as viewing, generation or manipulation."
LICENSE = "Apache-2.0"

PV = "1.18"

RPM_NAME = "xmlgraphics-batik-1.18-1.7.noarch.rpm"
RPM_HASH = "152fe4244022f93c3300f1d9d500cc3e011a0daca63480770a8a2ef41411e9101d2b98196bb89f327d0f44dbc2b085622c1f490dcdc89b2612c24a163daef624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik \
mvn-org.apache.xmlgraphics-batik-anim \
mvn-org.apache.xmlgraphics-batik-anim-pom- \
mvn-org.apache.xmlgraphics-batik-awt-util \
mvn-org.apache.xmlgraphics-batik-awt-util-pom- \
mvn-org.apache.xmlgraphics-batik-bridge \
mvn-org.apache.xmlgraphics-batik-bridge-pom- \
mvn-org.apache.xmlgraphics-batik-codec \
mvn-org.apache.xmlgraphics-batik-codec-pom- \
mvn-org.apache.xmlgraphics-batik-constants \
mvn-org.apache.xmlgraphics-batik-constants-pom- \
mvn-org.apache.xmlgraphics-batik-dom \
mvn-org.apache.xmlgraphics-batik-dom-pom- \
mvn-org.apache.xmlgraphics-batik-ext \
mvn-org.apache.xmlgraphics-batik-ext-pom- \
mvn-org.apache.xmlgraphics-batik-extension \
mvn-org.apache.xmlgraphics-batik-extension-pom- \
mvn-org.apache.xmlgraphics-batik-gui-util \
mvn-org.apache.xmlgraphics-batik-gui-util-pom- \
mvn-org.apache.xmlgraphics-batik-gvt \
mvn-org.apache.xmlgraphics-batik-gvt-pom- \
mvn-org.apache.xmlgraphics-batik-i18n \
mvn-org.apache.xmlgraphics-batik-i18n-pom- \
mvn-org.apache.xmlgraphics-batik-parser \
mvn-org.apache.xmlgraphics-batik-parser-pom- \
mvn-org.apache.xmlgraphics-batik-script \
mvn-org.apache.xmlgraphics-batik-script-pom- \
mvn-org.apache.xmlgraphics-batik-shared-resources \
mvn-org.apache.xmlgraphics-batik-shared-resources-pom- \
mvn-org.apache.xmlgraphics-batik-svg-dom \
mvn-org.apache.xmlgraphics-batik-svg-dom-pom- \
mvn-org.apache.xmlgraphics-batik-svgbrowser \
mvn-org.apache.xmlgraphics-batik-svgbrowser-pom- \
mvn-org.apache.xmlgraphics-batik-svggen \
mvn-org.apache.xmlgraphics-batik-svggen-pom- \
mvn-org.apache.xmlgraphics-batik-svgrasterizer \
mvn-org.apache.xmlgraphics-batik-svgrasterizer-pom- \
mvn-org.apache.xmlgraphics-batik-swing \
mvn-org.apache.xmlgraphics-batik-swing-pom- \
mvn-org.apache.xmlgraphics-batik-transcoder \
mvn-org.apache.xmlgraphics-batik-transcoder-pom- \
mvn-org.apache.xmlgraphics-batik-util \
mvn-org.apache.xmlgraphics-batik-util-pom- \
mvn-org.apache.xmlgraphics-batik-xml \
mvn-org.apache.xmlgraphics-batik-xml-pom- \
osgi-org.apache.batik.anim \
osgi-org.apache.batik.awt-util \
osgi-org.apache.batik.bridge \
osgi-org.apache.batik.codec \
osgi-org.apache.batik.constants \
osgi-org.apache.batik.dom \
osgi-org.apache.batik.ext \
osgi-org.apache.batik.extension \
osgi-org.apache.batik.gui-util \
osgi-org.apache.batik.gvt \
osgi-org.apache.batik.i18n \
osgi-org.apache.batik.parser \
osgi-org.apache.batik.script \
osgi-org.apache.batik.shared-resources \
osgi-org.apache.batik.svg-dom \
osgi-org.apache.batik.svgbrowser \
osgi-org.apache.batik.svggen \
osgi-org.apache.batik.svgrasterizer \
osgi-org.apache.batik.swing \
osgi-org.apache.batik.transcoder \
osgi-org.apache.batik.util \
osgi-org.apache.batik.xml \
xmlgraphics-batik"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.xmlgraphics-batik-css \
mvn-org.apache.xmlgraphics-xmlgraphics-commons \
mvn-xml-apis-xml-apis \
mvn-xml-apis-xml-apis-ext \
xmlgraphics-batik-css"

inherit rpm
