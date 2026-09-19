SUMMARY = "Documentation for the LilyPond Typesetter (cs)"
DESCRIPTION = "Czech documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-doc-cs-2.24.4-1.19.noarch.rpm"
RPM_HASH = "caf5b2ff92e8dd0cc38ba61b4c77c5afaa40a711c4d1aa77cd8793d6575e711554aa87ae0841c8e7266464813877aa68fdcb0c92d9b0fd618bab59b4504aa18d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-cs"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
