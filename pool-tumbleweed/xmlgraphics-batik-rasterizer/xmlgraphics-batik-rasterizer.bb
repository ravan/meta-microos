SUMMARY = "Batik SVG rasterizer"
DESCRIPTION = "The SVG Rasterizer is a utility that can convert SVG files to a raster \
format. The tool can convert individual files or sets of files, making \
it easy to convert entire directories of SVG files. The supported \
formats are JPEG, PNG, and TIFF, however the design allows new formats \
to be added easily."
LICENSE = "Apache-2.0"

PV = "1.18"

RPM_NAME = "xmlgraphics-batik-rasterizer-1.18-1.7.noarch.rpm"
RPM_HASH = "3798a413b25087cc31ccda2e56b5c3b8f1737f7faa3ea963a3b853f65a9d285b156ffed4b382cd2663f00e4d25077182b745c711e62360e57c8e8af4f80f7783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-rasterizer \
config-xmlgraphics-batik-rasterizer \
mvn-org.apache.xmlgraphics-batik-rasterizer \
mvn-org.apache.xmlgraphics-batik-rasterizer-ext \
mvn-org.apache.xmlgraphics-batik-rasterizer-ext-pom- \
mvn-org.apache.xmlgraphics-batik-rasterizer-pom- \
osgi-org.apache.batik.rasterizer \
osgi-org.apache.batik.rasterizer-ext \
xmlgraphics-batik-rasterizer"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.apache.xmlgraphics-batik-extension \
mvn-org.apache.xmlgraphics-batik-shared-resources \
mvn-org.apache.xmlgraphics-batik-svgrasterizer \
rhino \
xml-commons-apis \
xmlgraphics-batik \
xmlgraphics-commons"

inherit rpm
