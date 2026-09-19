SUMMARY = "Javadoc for maven-osgi"
DESCRIPTION = "API documentation for maven-osgi."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "maven-osgi-javadoc-0.3.0-1.11.noarch.rpm"
RPM_HASH = "e1bfccc2d646443d182915b26d3a88953a272501141ec2193799d7a2ae9647e0391ebc5573bace52b8232715ea015d0c8081f2e0720e628e1cf1a91ff9c007eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-osgi-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
