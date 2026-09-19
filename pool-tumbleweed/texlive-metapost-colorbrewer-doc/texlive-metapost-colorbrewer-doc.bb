SUMMARY = "Documentation for texlive-metapost-colorbrewer"
DESCRIPTION = "This package includes the documentation for texlive-metapost-colorbrewer"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn48753"

RPM_NAME = "texlive-metapost-colorbrewer-doc-2026.226.svn48753-61.2.noarch.rpm"
RPM_HASH = "235b968360a1f3a6688f205907717ab4cf332dc70cadf7c1c49332ebf9b62fbf437751da4b64ec5a4ee1b1c2281ac859a328837c27200bd876461b8fa58ead59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metapost-colorbrewer-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
