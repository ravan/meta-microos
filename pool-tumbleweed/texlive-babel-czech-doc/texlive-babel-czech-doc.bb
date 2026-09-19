SUMMARY = "Documentation for texlive-babel-czech"
DESCRIPTION = "This package includes the documentation for texlive-babel-czech"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1asvn30261"

RPM_NAME = "texlive-babel-czech-doc-2026.226.3.1asvn30261-60.2.noarch.rpm"
RPM_HASH = "8ac9a87bef94d8a67efcbd4f946f5830c86fd65fafe078cb479ef2ef54694f89c1168ca1b631ec0663bbfc3897bd563933f38e7a292a5e669607af4e41e40eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-czech-doc"

RDEPENDS:${PN} += ""

inherit rpm
