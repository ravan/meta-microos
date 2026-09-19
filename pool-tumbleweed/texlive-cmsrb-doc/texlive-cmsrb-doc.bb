SUMMARY = "Documentation for texlive-cmsrb"
DESCRIPTION = "This package includes the documentation for texlive-cmsrb"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.0svn76790"

RPM_NAME = "texlive-cmsrb-doc-2026.226.4.0svn76790-60.2.noarch.rpm"
RPM_HASH = "5e0f03ebeba1ad576fc62124dd0fe3c0a2c1f448d5d3894525728a76c26830c0aabad7445d5979a1879e797fc5dc5f3d63607c569ff846d5ec21f945749cd005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cmsrb-doc-sr \
texlive-cmsrb-doc"

RDEPENDS:${PN} += ""

inherit rpm
