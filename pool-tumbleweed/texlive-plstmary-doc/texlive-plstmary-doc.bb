SUMMARY = "Documentation for texlive-plstmary"
DESCRIPTION = "This package includes the documentation for texlive-plstmary"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.5csvn31088"

RPM_NAME = "texlive-plstmary-doc-2026.226.0.0.5csvn31088-59.2.noarch.rpm"
RPM_HASH = "80a7f3d63bcad131c3005b60209669905127873ea6ed67f9d628255a4e16613d273927a4f786e620d9fdb8ad6dc05481e752d9b75fbb569ceeb2a7f9c06bb891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plstmary-doc"

RDEPENDS:${PN} += ""

inherit rpm
