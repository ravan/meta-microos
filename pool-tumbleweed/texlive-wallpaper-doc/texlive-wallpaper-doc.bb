SUMMARY = "Documentation for texlive-wallpaper"
DESCRIPTION = "This package includes the documentation for texlive-wallpaper"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn77682"

RPM_NAME = "texlive-wallpaper-doc-2026.226.1.10svn77682-60.2.noarch.rpm"
RPM_HASH = "b8754b8bf5c9ca0378e765e1311e11aa9caa5eb029514c3f91a9543e04d65d9a3bf9c6e7248dd7c7fbd9198b16547fda2aa69c38137c9199c8ad6ff8da35dea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wallpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
