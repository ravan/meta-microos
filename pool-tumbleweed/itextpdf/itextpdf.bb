SUMMARY = "A Free Java-PDF library"
DESCRIPTION = "iText is a library that allows you to generate PDF files on the fly. \
The iText classes are very useful for people who need to generate \
read-only, platform independent documents containing text, lists, \
tables and images. The library is especially useful in combination with \
Java(TM) technology-based Servlets: The look and feel of HTML is \
browser dependent; with iText and PDF you can control exactly how your \
servlet's output will look."
LICENSE = "AGPL-3.0-only"

PV = "5.5.13.4"

RPM_NAME = "itextpdf-5.5.13.4-1.4.noarch.rpm"
RPM_HASH = "4d49daf4259023f8cdeb0f4d79e59de6accb40ffcf714aae46416d82fe6c45855230cb9e203d3bc87c10016f1f946ffbec1d031c80cb6ce76656553c3bd16bbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itextpdf \
mvn-com.itextpdf-itext-pdfa \
mvn-com.itextpdf-itext-pdfa-pom- \
mvn-com.itextpdf-itext-xtra \
mvn-com.itextpdf-itext-xtra-pom- \
mvn-com.itextpdf-itextpdf \
mvn-com.itextpdf-itextpdf-pom- \
mvn-com.itextpdf-root-pom- \
mvn-com.itextpdf.tool-xmlworker \
mvn-com.itextpdf.tool-xmlworker-pom- \
osgi-com.itextpdf \
osgi-com.itextpdf.tool.xmlworker"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-imaging"

inherit rpm
