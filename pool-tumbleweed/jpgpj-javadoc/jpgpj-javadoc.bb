SUMMARY = "API documentation for jpgpj"
DESCRIPTION = "API documentation for jpgpj"
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "jpgpj-javadoc-1.3-1.5.noarch.rpm"
RPM_HASH = "b1f2feb36d4ae8f8c4a68d91cda4e01ae76bf2cbddf77e7e538fe00b32723f1a48bb7fdc9174653b81c081286f65c941b1cb666ce98e3a9b04f7fbab76ef9698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jpgpj-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
