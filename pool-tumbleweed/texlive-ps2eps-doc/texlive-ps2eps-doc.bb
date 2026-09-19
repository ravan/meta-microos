SUMMARY = "Documentation for texlive-ps2eps"
DESCRIPTION = "This package includes the documentation for texlive-ps2eps"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.70svn76924"

RPM_NAME = "texlive-ps2eps-doc-2026.226.1.70svn76924-59.2.noarch.rpm"
RPM_HASH = "1bdf250a94dca90075160344e25ba7fc69c9c346b0de620fd6b272412afe3ddd142b47d8cc6bdb6e316cab6cb0c085def32c737ba3964cd3df655b19b9041f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bbox.1 \
man-ps2eps.1 \
texlive-ps2eps-doc \
texlive-pstools-doc-/usr/share/man/man1/bbox.1.gz \
texlive-pstools-doc-/usr/share/man/man1/ps2eps.1.gz"

RDEPENDS:${PN} += ""

inherit rpm
