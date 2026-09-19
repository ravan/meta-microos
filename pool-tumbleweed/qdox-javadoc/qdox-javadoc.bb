SUMMARY = "Javadoc for qdox"
DESCRIPTION = "API docs for qdox."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "qdox-javadoc-2.1.0-1.8.noarch.rpm"
RPM_HASH = "cb2e80bc65703f95f2f2855927bf8f040fceb747f4a8864ea3460d64b0985b44d78ed1b34f6075ef2a59f1f21f4674e28d8973525afe25fde8252575eed0350a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qdox-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
