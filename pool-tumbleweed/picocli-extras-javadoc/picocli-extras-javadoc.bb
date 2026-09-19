SUMMARY = "Javadoc for picocli-extras"
DESCRIPTION = "This package contains the API documentation for picocli-extras."
LICENSE = "Apache-2.0"

PV = "4.7.7"

RPM_NAME = "picocli-extras-javadoc-4.7.7-1.3.noarch.rpm"
RPM_HASH = "39c070865ed151b195c0a521d1a21ea778bc72f4ee470e555346b89893af84ba969fe2fcd188703ca918ff025a370531bc6c4e623ed6d6d2f65192c6e5e1cb67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "picocli-extras-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
