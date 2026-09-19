SUMMARY = "Documentation for texlive-smalltableof"
DESCRIPTION = "This package includes the documentation for texlive-smalltableof"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20333"

RPM_NAME = "texlive-smalltableof-doc-2026.226.svn20333-64.2.noarch.rpm"
RPM_HASH = "0adeb195ce922c12337bb986c6e2b2a8108625c9f291582c5e1f6efc22521918b564b1a04bbcfda42244bdce36bc075654ab56d10501f541a1e52884e6fbc64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-smalltableof-doc-fr \
texlive-smalltableof-doc"

RDEPENDS:${PN} += ""

inherit rpm
