SUMMARY = "Documentation for the LilyPond Typesetter (de)"
DESCRIPTION = "German documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-doc-de-2.24.4-1.19.noarch.rpm"
RPM_HASH = "22508b3e129434d44701a860b09ae61020938c914d541fbd9b5907c29c244b1b9ec10dbfabd9b822162e1419b436e42aeb95f9d6a718a7fd0748134e7d4d5c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-de"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
