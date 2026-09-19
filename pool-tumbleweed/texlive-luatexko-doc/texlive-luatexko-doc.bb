SUMMARY = "Documentation for texlive-luatexko"
DESCRIPTION = "This package includes the documentation for texlive-luatexko"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.7svn78005"

RPM_NAME = "texlive-luatexko-doc-2026.226.5.7svn78005-59.2.noarch.rpm"
RPM_HASH = "75632bb5cd208e906e2ec5e4327b63bf40de05a1fb953d668792a4edbda373821e9116033675c6ae7d4ab3f2eb8f677eddafff84ed0e09abc03b60722b54fb06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-luatexko-doc-ko \
texlive-luatexko-doc"

RDEPENDS:${PN} += ""

inherit rpm
