SUMMARY = "Documentation for texlive-tabls"
DESCRIPTION = "This package includes the documentation for texlive-tabls"
LICENSE = "LPPL-1.0"

PV = "2026.227.3.5svn77682"

RPM_NAME = "texlive-tabls-doc-2026.227.3.5svn77682-62.2.noarch.rpm"
RPM_HASH = "1b937a75c36ab450b0122a547f2eaf5f638ec6327da54f106c84a00d2fc554ae80b7c728da8ad8d87023ec156e21c3fcc66feda43f1754c6674b2bac6a0d9ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabls-doc"

RDEPENDS:${PN} += ""

inherit rpm
