SUMMARY = "Javadoc for jdom2"
DESCRIPTION = "This package contains javadoc for jdom2."
LICENSE = "Saxpath"

PV = "2.0.6.1"

RPM_NAME = "jdom2-javadoc-2.0.6.1-3.9.noarch.rpm"
RPM_HASH = "e172b4371af91a64207f1ab44f987b838c69204fd243df2205a6e40f18b528ff54b0059bd170b05385f33a2ff2d3104c0139eb1fe4dde748db710effdc02a783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
