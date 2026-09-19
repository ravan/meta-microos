SUMMARY = "Documentation for texlive-cjk-gs-integrate"
DESCRIPTION = "This package includes the documentation for texlive-cjk-gs-integrate"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.20210625.0svn59705"

RPM_NAME = "texlive-cjk-gs-integrate-doc-2026.226.20210625.0svn59705-60.2.noarch.rpm"
RPM_HASH = "f46cb830e645a66cc4dab6c7a2416af559f58899f8ecf539e484e3bcc4a418be42cecf7f1372c5ec6c11ee92a354418cd973533be69900e98cd5aa3673514543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjk-gs-integrate-doc"

RDEPENDS:${PN} += ""

inherit rpm
