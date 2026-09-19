SUMMARY = "Documentation for the LilyPond Typesetter (it)"
DESCRIPTION = "Italian documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-doc-it-2.24.4-1.19.noarch.rpm"
RPM_HASH = "73076572915ea4d023986e926e698ca37a4d3593e0f7f0e8b700ba0e500117257e7520b77673cce2698e39f9789f3ca0554b600142c57d85826a1dc11def5ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-it"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
