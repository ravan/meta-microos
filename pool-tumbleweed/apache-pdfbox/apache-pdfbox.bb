SUMMARY = "Java PDF Library"
DESCRIPTION = "The Apache PDFBox library is an open source Java tool for working with PDF documents. \
This project allows creation of new PDF documents, manipulation of existing documents \
and the ability to extract content from documents. \
Apache PDFBox also includes several command line utilities."
LICENSE = "Apache-2.0 & OFL-1.1"

PV = "2.0.36"

RPM_NAME = "apache-pdfbox-2.0.36-1.3.noarch.rpm"
RPM_HASH = "ea62c6061912d1a31779df7f9330f6f65402c164020a01288fe0645ce684061240032f1b4c63ad7a1e86dc589c26dfd0e3bba2baa8617972b9beac6173b2a70d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-pdfbox \
mvn-org.apache.pdfbox-fontbox \
mvn-org.apache.pdfbox-fontbox-pom- \
mvn-org.apache.pdfbox-pdfbox \
mvn-org.apache.pdfbox-pdfbox-debugger \
mvn-org.apache.pdfbox-pdfbox-debugger-pom- \
mvn-org.apache.pdfbox-pdfbox-pom- \
mvn-org.apache.pdfbox-pdfbox-tools \
mvn-org.apache.pdfbox-pdfbox-tools-pom- \
mvn-org.apache.pdfbox-xmpbox \
mvn-org.apache.pdfbox-xmpbox-pom- \
osgi-org.apache.pdfbox \
osgi-org.apache.pdfbox.fontbox \
osgi-org.apache.pdfbox.xmpbox"

RDEPENDS:${PN} += "apache-commons-logging \
java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging \
mvn-org.bouncycastle-bcpkix-jdk18on"

inherit rpm
