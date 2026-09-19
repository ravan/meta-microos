SUMMARY = "Javadoc for tagsoup"
DESCRIPTION = "Javadoc package for tagsoup."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "tagsoup-javadoc-1.2.1-6.9.noarch.rpm"
RPM_HASH = "22cefa621c5a9aca5cc32e9eaf2a3d45586f1c481be4d0409369cd3f0af05a0c72c0f44cef785c5e970c715402769e8789e9008878c826adac7b864a96757b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tagsoup-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
