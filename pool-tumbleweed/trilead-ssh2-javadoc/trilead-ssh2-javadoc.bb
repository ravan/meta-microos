SUMMARY = "Javadoc for trilead-ssh2"
DESCRIPTION = "API documentation for trilead-ssh2."
LICENSE = "BSD-3-Clause & MIT"

PV = "217.293.v56de4d4d3515"

RPM_NAME = "trilead-ssh2-javadoc-217.293.v56de4d4d3515-1.9.noarch.rpm"
RPM_HASH = "ebf81e74b1b3204601e908b1ef3c9a4a0c4bc64d2970c957188acd557f64b7652bcb825d00acbf9a7e5f7509043e7a249a1d3071f4146b31c05385351fbe11d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilead-ssh2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
