SUMMARY = "API documentation for plexus-metadata-generator"
DESCRIPTION = "API documentation for plexus-metadata-generator."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.2.0"

RPM_NAME = "plexus-metadata-generator-javadoc-2.2.0-3.1.noarch.rpm"
RPM_HASH = "332b0ee3b4abe3705f33daf7d5af607394bd11c9e843ae48ed0125fba50d11e79eca6a137e27b4066f97df85859dff3aced406497bf17ddbd5fd1422395a1ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-metadata-generator-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
