SUMMARY = "Documentation for texlive-babel-albanian"
DESCRIPTION = "This package includes the documentation for texlive-babel-albanian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0dsvn77682"

RPM_NAME = "texlive-babel-albanian-doc-2026.226.1.0dsvn77682-60.2.noarch.rpm"
RPM_HASH = "4f4a23152bc8a1e34c5def184901517e0039c7c5a4eb89a488be6dd84a83959730be7811011117d803a9e55de63727bd4d8fe09865a4c6ee0f33ba2c0fa4c50f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-albanian-doc"

RDEPENDS:${PN} += ""

inherit rpm
