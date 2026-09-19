SUMMARY = "Javadoc for dom4j"
DESCRIPTION = "Javadoc for dom4j."
LICENSE = "Plexus"

PV = "2.1.5"

RPM_NAME = "dom4j-javadoc-2.1.5-1.3.noarch.rpm"
RPM_HASH = "c0c68d9b23dca14e82b58f8ebbd0ac4493de77bf18977cfa16487fe5abb1a2e13e4f515f4f452725fd6ef937041965a08897fd63d599b6a841adf4c50a7ceb4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
