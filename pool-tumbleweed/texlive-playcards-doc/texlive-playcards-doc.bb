SUMMARY = "Documentation for texlive-playcards"
DESCRIPTION = "This package includes the documentation for texlive-playcards"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.0.0.2.1svn67342"

RPM_NAME = "texlive-playcards-doc-2026.226.0.0.2.1svn67342-59.2.noarch.rpm"
RPM_HASH = "5d0816ff2d757a95180348f8544c0157eeaf8b14f5bab5d2ba95432db5ba1f05f7126f36fc58530d61da9451a548126a20654da1ae49f58e10ad404a3bbf076d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-playcards-doc-fr \
texlive-playcards-doc"

RDEPENDS:${PN} += ""

inherit rpm
