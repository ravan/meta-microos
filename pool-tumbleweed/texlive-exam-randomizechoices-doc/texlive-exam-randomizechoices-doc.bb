SUMMARY = "Documentation for texlive-exam-randomizechoices"
DESCRIPTION = "This package includes the documentation for texlive-exam-randomizechoices"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn61719"

RPM_NAME = "texlive-exam-randomizechoices-doc-2026.226.0.0.2svn61719-59.2.noarch.rpm"
RPM_HASH = "979a093132c110d185b12756e3a628ad32cbf11b09fc62c82afb2a5cca4a95d0d9c6ebec7bdf768c44f512c084ee92113976f641078f0ebe2c08b370771304e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-randomizechoices-doc"

RDEPENDS:${PN} += ""

inherit rpm
