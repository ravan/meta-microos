SUMMARY = "Documentation for texlive-pst-vowel"
DESCRIPTION = "This package includes the documentation for texlive-pst-vowel"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn25228"

RPM_NAME = "texlive-pst-vowel-doc-2026.226.1.0svn25228-60.4.noarch.rpm"
RPM_HASH = "41c116a93daed7a6b6c3043beb03930f366343fc71a1ec47d36eef7c33d03f4de8a53b4e51bd990dd7909af8b8225f011497134bb1e39c43eca417d167bec459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-vowel-doc"

RDEPENDS:${PN} += ""

inherit rpm
