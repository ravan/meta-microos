SUMMARY = "Documentation for the LilyPond Typesetter (zh)"
DESCRIPTION = "Chinese documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-doc-zh-2.24.4-1.19.noarch.rpm"
RPM_HASH = "a076de82815551eef75537695d45cf3f9cdba7dfa772e46277cac71868ae2a9e3f263af06d0632c2ec6ebf4c11b7604a845fc6af3eeeff820c7797cf40f1c4b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-zh"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
