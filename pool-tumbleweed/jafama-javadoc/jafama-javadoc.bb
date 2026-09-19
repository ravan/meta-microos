SUMMARY = "Javadoc for jafama"
DESCRIPTION = "API documentation for jafama."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "jafama-javadoc-2.3.2-1.5.noarch.rpm"
RPM_HASH = "a93509c15d42538fafdcdb7e942ca07c596e183e160777f1aaadc38ec08450678ecaf8ea6f940cb847a8e197148b21086873bf396193117016cbb3484e9a916b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jafama-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
