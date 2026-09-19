SUMMARY = "Documentation for texlive-wordcount"
DESCRIPTION = "This package includes the documentation for texlive-wordcount"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn46165"

RPM_NAME = "texlive-wordcount-doc-2026.226.1.7svn46165-60.2.noarch.rpm"
RPM_HASH = "263e16502aa8e321e0193da3a14c6d183ef78d8429fecf6261a1e54404c3a44122ff30d9dc798f63c65011efc0a8d8ed0fde4c4ef208173a06a440402c6b1a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wordcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
