SUMMARY = "Documentation for the LilyPond Typesetter (ja)"
DESCRIPTION = "Japanese documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-doc-ja-2.24.4-1.19.noarch.rpm"
RPM_HASH = "00f0f26d6be60cfad2611fba94883e0f5bc46c076f2c10fa0574da2c84ef9b7c1e893d5707b669905daad706df609accac1d720662894924eea0c36e19ac9948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-ja"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
