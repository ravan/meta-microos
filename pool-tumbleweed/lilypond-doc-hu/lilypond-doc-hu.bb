SUMMARY = "Documentation for the LilyPond Typesetter (hu)"
DESCRIPTION = "Hungary documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-doc-hu-2.24.4-1.19.noarch.rpm"
RPM_HASH = "e9082ac115914bf2c797c48e58d6e40167c53e9f93aad3af94f50665f5fea0df3b8bbfdab9fbb2cefdbfb5363f2460657c02ce34097df961862748a30df9da1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-hu"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
