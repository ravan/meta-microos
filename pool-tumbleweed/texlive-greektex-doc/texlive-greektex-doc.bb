SUMMARY = "Documentation for texlive-greektex"
DESCRIPTION = "This package includes the documentation for texlive-greektex"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn28327"

RPM_NAME = "texlive-greektex-doc-2026.226.svn28327-60.4.noarch.rpm"
RPM_HASH = "d758a449ae0bf2d1f2349e2d84bf2243cf1829d9cb1b885a7767bdda3cd5ea0c6f48f98f84f59450a325347a04922305cbf0ebccfc740573286228f4cb12ed92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-greektex-doc-el \
texlive-greektex-doc"

RDEPENDS:${PN} += ""

inherit rpm
