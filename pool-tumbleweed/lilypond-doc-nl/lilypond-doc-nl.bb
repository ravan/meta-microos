SUMMARY = "Documentation for the LilyPond Typesetter (nl)"
DESCRIPTION = "Dutch documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-doc-nl-2.24.4-1.19.noarch.rpm"
RPM_HASH = "dbe9828cf577c597fcdf40883f8ef7164a343fe26276dcb23262c60f41e25492345a97419b56d7671424abcf28fa3dc9d1753dac80f26e0a54b232e2a8977ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-nl"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
