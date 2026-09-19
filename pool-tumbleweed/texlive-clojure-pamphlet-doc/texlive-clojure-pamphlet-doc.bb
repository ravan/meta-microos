SUMMARY = "Documentation for texlive-clojure-pamphlet"
DESCRIPTION = "This package includes the documentation for texlive-clojure-pamphlet"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-clojure-pamphlet-doc-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "ccde4b78619d430ba81b2439a0632270ab8cfe0aacd0b3c5e4e047a47413052ff2c287c045890ba48670fa109ef329785d4bc6d950c10ca112ffc1c53473b4ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pamphletangler.1 \
texlive-clojure-pamphlet-doc"

RDEPENDS:${PN} += ""

inherit rpm
