SUMMARY = "Documentation for texlive-tpslifonts"
DESCRIPTION = "This package includes the documentation for texlive-tpslifonts"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.6svn42428"

RPM_NAME = "texlive-tpslifonts-doc-2026.226.0.0.6svn42428-59.2.noarch.rpm"
RPM_HASH = "ba5219b9cc65ecab4cb74676f3d1b0d5e9438b5f8794fe04a79aa6905b7af0b964ba198535783b8d570b860dce6fd3a4d0455749cd5c8edf49e03a15318895f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tpslifonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
