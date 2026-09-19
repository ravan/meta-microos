SUMMARY = "Documentation for texlive-tamefloats"
DESCRIPTION = "This package includes the documentation for texlive-tamefloats"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.42svn27345"

RPM_NAME = "texlive-tamefloats-doc-2026.227.0.0.42svn27345-62.2.noarch.rpm"
RPM_HASH = "7e886a66abc7310a6fe092a7faa6eda2ac26cbe8ba04d5c844a118e4a0145a60023a79506adde23182b3be797d553891d4d8979be996051c44b55b77e1337c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tamefloats-doc"

RDEPENDS:${PN} += ""

inherit rpm
