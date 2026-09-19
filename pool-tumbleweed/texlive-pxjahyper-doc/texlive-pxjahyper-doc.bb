SUMMARY = "Documentation for texlive-pxjahyper"
DESCRIPTION = "This package includes the documentation for texlive-pxjahyper"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-pxjahyper-doc-2026.226.1.5svn77682-60.4.noarch.rpm"
RPM_HASH = "bebe2ca54ae16a6d7aa57f831cd5cbfb12415f71381e060440a687b0c3b60ce891ab205c05b33d204dbbd9367c6cdc3e822f62f6952bd9fb1ec775fd5cee373c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxjahyper-doc-ja \
texlive-pxjahyper-doc"

RDEPENDS:${PN} += ""

inherit rpm
