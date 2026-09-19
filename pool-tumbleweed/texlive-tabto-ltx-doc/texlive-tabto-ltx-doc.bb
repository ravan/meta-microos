SUMMARY = "Documentation for texlive-tabto-ltx"
DESCRIPTION = "This package includes the documentation for texlive-tabto-ltx"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.4svn78101"

RPM_NAME = "texlive-tabto-ltx-doc-2026.227.1.4svn78101-62.2.noarch.rpm"
RPM_HASH = "1caa59b4422b3cb8f6828db1a8286e700ad08753b627dabb3777b9e927b8898a97db9a3e294afd10e374417ba29bddc89d3bb3b9bc61f8e804fc3eebd0935375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabto-ltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
