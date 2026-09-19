SUMMARY = "Documentation for texlive-codepage"
DESCRIPTION = "This package includes the documentation for texlive-codepage"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn51502"

RPM_NAME = "texlive-codepage-doc-2026.226.svn51502-60.2.noarch.rpm"
RPM_HASH = "87815348ce1cdbf26e690a583595e4cdaaf19412b5a3118e58c8689ed368b6cdedb978faaf13dd85fc6849b31303c3e24e1c5c6323755a7e683e2ee82bb28dd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-codepage-doc-fr;en \
texlive-codepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
