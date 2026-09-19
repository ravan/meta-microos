SUMMARY = "Documentation for texlive-babel-croatian"
DESCRIPTION = "This package includes the documentation for texlive-babel-croatian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3lsvn77682"

RPM_NAME = "texlive-babel-croatian-doc-2026.226.1.3lsvn77682-60.2.noarch.rpm"
RPM_HASH = "93451142d9e8e05e35fd51bd0549477345335783d06664a3cd5348f81b24253b4af539bb2bc64754ad0185c5173ac7a3d65f3ede57891aa854ebe90a815815bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-croatian-doc"

RDEPENDS:${PN} += ""

inherit rpm
