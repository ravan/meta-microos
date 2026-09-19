SUMMARY = "API documentation for maven-jarsigner-plugin"
DESCRIPTION = "This package contains the API documentation for maven-jarsigner-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-jarsigner-plugin-javadoc-3.0.0-4.16.noarch.rpm"
RPM_HASH = "2a4ec6138ca27215338d713143aaff76f08143b4b0a9e64859e94b888b17e49599e16041f400a8457e9b654e1609f431e0a83694bb219bcf4c7c63ccdd35a531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jarsigner-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
