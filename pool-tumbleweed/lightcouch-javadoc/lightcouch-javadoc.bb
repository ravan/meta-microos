SUMMARY = "Javadoc for lightcouch"
DESCRIPTION = "This package contains javadoc for lightcouch."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "lightcouch-javadoc-0.2.0-1.18.noarch.rpm"
RPM_HASH = "747f04908fa058320313b7bbf1cf0317527cd16cc6f874591cfc3b3995090c83566d1ce498d9c85f83621f9f177b1bf0222cc03954a6b77b34962319e3a2498f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightcouch-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
