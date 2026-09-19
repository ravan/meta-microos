SUMMARY = "Javadoc for felix-gogo-shell"
DESCRIPTION = "This package contains the API documentation for felix-gogo-shell."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "felix-gogo-shell-javadoc-1.1.4-3.4.noarch.rpm"
RPM_HASH = "ee955dcf896bceca9a4f7c94d6661f3a4e5a4b9d29ccc201a83e6b4fc430fed84b5536cd3b640611342b154b58cd249abe81b55caaa913b843d5a936c99eb103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-shell-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
