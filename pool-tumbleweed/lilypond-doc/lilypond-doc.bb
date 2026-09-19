SUMMARY = "Documentation for the LilyPond Typesetter"
DESCRIPTION = "Common and english documentation files for the \
GNU LilyPond music typesetter."
LICENSE = "GFDL-1.3-only"

PV = "2.24.4"

RPM_NAME = "lilypond-doc-2.24.4-1.19.noarch.rpm"
RPM_HASH = "dc4aac884886d18be49d0486cde29d03aefa9d0fb92068e76bf74935e31e2541fd16feab3ba9d15e4d1edea4956fe109a80eb7f94e1183d208c6ab08cd6d3b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc \
lilypond-documentation"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
