SUMMARY = "Documentation for texlive-hyphen-sanskrit"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-sanskrit"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-sanskrit-doc-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "ef3e51ff53d5faf095fcea97985c302a498659e911587c90914f0d8a14bfe60a9f93883a6f488fed8119addb8e69f4165b0d84aa9a6888d399f1ba19d5d2765c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-sanskrit-doc"

RDEPENDS:${PN} += ""

inherit rpm
