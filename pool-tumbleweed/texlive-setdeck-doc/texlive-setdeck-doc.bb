SUMMARY = "Documentation for texlive-setdeck"
DESCRIPTION = "This package includes the documentation for texlive-setdeck"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1svn40613"

RPM_NAME = "texlive-setdeck-doc-2026.226.0.0.1svn40613-60.2.noarch.rpm"
RPM_HASH = "99f4f243cfec2951da7988d10de9ce65d82a2e407f07727b30352f583afb6bfe13beb81162e4af96fcfa022930466a37a0bc5b69fd781366c87adcfa3599d1b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-setdeck-doc"

RDEPENDS:${PN} += ""

inherit rpm
