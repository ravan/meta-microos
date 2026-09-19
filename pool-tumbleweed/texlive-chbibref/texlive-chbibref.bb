SUMMARY = "Change the Bibliography/References title"
DESCRIPTION = "Defines a single command, \\setbibref, which sets whichever of \
\\bibname and \\refname is in use. (\\bibname is used in book.cls \
and report.cls, and \\refname is used in article.cls.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn17120"

RPM_NAME = "texlive-chbibref-2026.226.1.0svn17120-60.2.noarch.rpm"
RPM_HASH = "4ab81888242b99a14bdc5088bb71987e4a1402ecd90cd2407a456129424d5f0c7ce937c045731da51f9183b7d86066307f8c196f6d4774d655e1104b8140785f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chbibref.sty \
texlive-chbibref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
