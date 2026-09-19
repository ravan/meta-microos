SUMMARY = "Mark research contributions in scientific documents and embed them in PDF metadata"
DESCRIPTION = "Scientific Knowledge Graph TeX (SciKgTeX) is a LuaLaTeX package \
which makes it possible to annotate specific research \
contributions in scientific documents. SciKGTeX will enrich the \
document by adding the marked contributions to PDF metadata in \
a structured XMP format which can be picked up by search \
engines and knowledge graphs."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.0svn66764"

RPM_NAME = "texlive-scikgtex-2026.226.2.2.0svn66764-60.2.noarch.rpm"
RPM_HASH = "9c7a35116aa0b89b68cc229a39a4812ea6d73e98aad5d5c322ad6fcf5044fc77904b60030aeefda51c1f0623a6038d82d8fc28de95d203006154b22dcc2aec05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scikgtex.sty \
texlive-scikgtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-suffix.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
