SUMMARY = "Javadoc for maven-invoker-plugin"
DESCRIPTION = "API documentation for maven-invoker-plugin."
LICENSE = "Apache-2.0"

PV = "3.10.1"

RPM_NAME = "maven-invoker-plugin-javadoc-3.10.1-1.2.noarch.rpm"
RPM_HASH = "0895bb8b3dd4fcd2b52a6f9edd25325935f89d245bb09d3aee5859c65bc5b5d4d4bcc350acbabbf12cba4a5a8f7c005187f4021e1f6b6f297ed199023ca263f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-invoker-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
