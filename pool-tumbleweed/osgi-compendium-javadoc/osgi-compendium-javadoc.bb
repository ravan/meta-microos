SUMMARY = "API documentation for osgi-compendium"
DESCRIPTION = "This package provides API documentation for osgi-compendium."
LICENSE = "Apache-2.0"

PV = "8.0.0"

RPM_NAME = "osgi-compendium-javadoc-8.0.0-1.8.noarch.rpm"
RPM_HASH = "1c84dafb016f8b19a8dd0840353cc693eb949054e444d0163afc3954231ad993a4cd2aff867f308a7f8dd76ace396447c55f77f26c9f9d2463b4b98d3030e63f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-compendium-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
