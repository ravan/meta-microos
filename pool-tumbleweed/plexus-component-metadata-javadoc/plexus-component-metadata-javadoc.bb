SUMMARY = "API documentation for plexus-component-metadata"
DESCRIPTION = "API documentation for plexus-component-metadata."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.2.0"

RPM_NAME = "plexus-component-metadata-javadoc-2.2.0-3.1.noarch.rpm"
RPM_HASH = "3fdc8b2fb38cca51e73bee5a6244f95ff8d09353366b59aba4f22a8798e8825ec7b1d53ceef49a90780499cd889e312b60cea02b28805d168818cf5f7ad0e891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-component-metadata-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
