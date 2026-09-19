SUMMARY = "Documentation for texlive-drm"
DESCRIPTION = "This package includes the documentation for texlive-drm"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.4svn38157"

RPM_NAME = "texlive-drm-doc-2026.226.4.4svn38157-59.2.noarch.rpm"
RPM_HASH = "43a7f77aee8c39dd6b706d1fd4e5eb693d8515ad8a82b7629b8143d6f56833269c4609bf48f12ec51572ee89af5594aa27fee18dafcd81d96ac4bbbce8022796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drm-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/fontforge \
/usr/bin/sh"

inherit rpm
