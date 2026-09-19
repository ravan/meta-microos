SUMMARY = "Javadoc for ed25519-java"
DESCRIPTION = "This package contains javadoc for ed25519-java."
LICENSE = "CC0-1.0"

PV = "0.3.0"

RPM_NAME = "ed25519-java-javadoc-0.3.0-6.6.noarch.rpm"
RPM_HASH = "58eb358841dbe9ebdff9b71954d27b4d12f9a97c9500cbed3d586e36876485bc463d274fb14e3e581b409b7e86affc6ace4dea8739baca96f3f3e9d394f7e233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ed25519-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
