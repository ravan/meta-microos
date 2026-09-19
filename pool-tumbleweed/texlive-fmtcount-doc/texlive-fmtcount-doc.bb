SUMMARY = "Documentation for texlive-fmtcount"
DESCRIPTION = "This package includes the documentation for texlive-fmtcount"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.12svn77682"

RPM_NAME = "texlive-fmtcount-doc-2026.226.3.12svn77682-60.2.noarch.rpm"
RPM_HASH = "f86d5e7bd6cc29021f7cf5e96d83d167bb3c0d6c0a3d8237037c59437cf0aca63c4ddc02a73eba1cecf55f7dd4c9ec68a2c093f5f2edbca8a692db167a1eab68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fmtcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
