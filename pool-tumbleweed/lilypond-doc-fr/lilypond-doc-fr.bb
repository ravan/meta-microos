SUMMARY = "Documentation for the LilyPond Typesetter (fr)"
DESCRIPTION = "French documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-doc-fr-2.24.4-1.19.noarch.rpm"
RPM_HASH = "73363e51022c888e1ad6c3d849eda9c395090a1f6697a9d14e0c24cc6032f291eaaf393921cfd3f794d48f0082eaddeab3a0f3b318216cd866883ec93ca6a651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-fr"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
