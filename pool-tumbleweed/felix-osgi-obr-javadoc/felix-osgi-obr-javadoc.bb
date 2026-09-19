SUMMARY = "Javadoc for felix-osgi-obr"
DESCRIPTION = "API documentation for felix-osgi-obr."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "felix-osgi-obr-javadoc-1.0.2-3.8.noarch.rpm"
RPM_HASH = "a3e3b0f4a0a6167636886cfed55727711817d834f4bdd6767903640dfca0539754a3aee022510cee34989a0e1991f5ea254f87883f175fdc05ff0a29b59588f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-osgi-obr-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
