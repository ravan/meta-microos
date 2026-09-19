SUMMARY = "Javadoc for jctools"
DESCRIPTION = "This package contains javadoc for jctools."
LICENSE = "Apache-2.0"

PV = "4.0.6"

RPM_NAME = "jctools-javadoc-4.0.6-1.2.noarch.rpm"
RPM_HASH = "64d0fc9017eba7a57f0d9f1b680a2c5289e0d3270bbe56f4d2aa617f90e1e6662fb54f6ff0fbe713fd610a24c20202cae44ae5d1decd0a00d9fc0938a30f9971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
