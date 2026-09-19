SUMMARY = "Javadoc for atinject"
DESCRIPTION = "This package contains the API documentation for atinject."
LICENSE = "Apache-2.0"

PV = "1+20211017gitd06ce18"

RPM_NAME = "atinject-javadoc-1+20211017gitd06ce18-2.1.noarch.rpm"
RPM_HASH = "54821f9924c91cbf7d15044a418a446f011b7f645edbd3ad96feea1d986c4bf6655ce2168c0f85bbac85cfb6a40feeafcc4b184f86ee1dc1270fe6a79f3c3009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atinject-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
