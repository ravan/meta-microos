SUMMARY = "Documentation for texlive-teubner"
DESCRIPTION = "This package includes the documentation for texlive-teubner"
LICENSE = "LPPL-1.0"

PV = "2026.227.5.8.3svn68074"

RPM_NAME = "texlive-teubner-doc-2026.227.5.8.3svn68074-62.2.noarch.rpm"
RPM_HASH = "e1ec1fd3dd4b16129bba7f529536e45081746118173caa9d8185817f9205015f15684126e49748cd6697f29acc1dcbcdbfa7bb51d4d1b793485c504bd0ea9921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-teubner-doc"

RDEPENDS:${PN} += ""

inherit rpm
