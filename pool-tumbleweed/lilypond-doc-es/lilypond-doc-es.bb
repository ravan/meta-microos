SUMMARY = "Documentation for the LilyPond Typesetter (es)"
DESCRIPTION = "Spanish documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-doc-es-2.24.4-1.19.noarch.rpm"
RPM_HASH = "72290a4bb5d0a7c61f674fece42e6f0da196f63589b961ff036f3fcb1764805a6fc139fab4bee871f2d02cde55128ee5cb4e3bd7de4ceb116ab533ceac06cab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-es"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
