SUMMARY = "Javadoc for plexus-i18n"
DESCRIPTION = "Javadoc for plexus-i18n."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "plexus-i18n-javadoc-1.0.0-1.5.noarch.rpm"
RPM_HASH = "4d7f494a305919643a5cfa4dbc077dc3e15c9e19e40dd78c332253345eb344e16396de4e177201573baa9f60e6cba59ad77e3a5a6e3b68b11537b49ba627e05f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-i18n-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
