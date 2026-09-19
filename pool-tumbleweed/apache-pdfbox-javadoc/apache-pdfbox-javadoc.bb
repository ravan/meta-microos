SUMMARY = "API Documentation for PDFBox"
DESCRIPTION = "JavaDoc documentation for apache-pdfbox"
LICENSE = "Apache-2.0 & OFL-1.1"

PV = "2.0.36"

RPM_NAME = "apache-pdfbox-javadoc-2.0.36-1.3.noarch.rpm"
RPM_HASH = "ef66ab90b3359fe309bbfc017a9491579fc073a93a6139c6dc1f11323800c44134522abddfdb241cd62b229ca8ce992bdbc3b570f2cf18f8512c5b979a3c11e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-pdfbox-javadoc"

RDEPENDS:${PN} += "apache-pdfbox \
javapackages-filesystem"

inherit rpm
