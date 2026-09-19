SUMMARY = "Low-level PDF integration for LuaTeX"
DESCRIPTION = "This package adds low-level support to plain LuaTeX for marking \
up the structure of a PDF document. The implementation is \
rather basic, but should allow you to make your PDFs fully \
PDF/A-compliant."
LICENSE = "LPPL-1.0"

PV = "2026.226.2025_1.7svn77682"

RPM_NAME = "texlive-minim-pdf-2026.226.2025_1.7svn77682-61.2.noarch.rpm"
RPM_HASH = "59c3a6e1c7daa0d7c05e73fc82c7eed1a3c5113e88827d92b7325c88a4ba52b19d6c44ec3363c0f1ba20516aeb5e06db34bf6c6905ea62e12976075fba63a465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minim-pdf.tex \
texlive-minim-pdf"

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
