SUMMARY = "Bundle individual documents into a single document"
DESCRIPTION = "The combine class lets you bundle individual documents into a \
single document, such as when preparing a conference \
proceedings. The auxiliary combinet package puts the titles and \
authors from \\maketitle commands into the main document's Table \
of Contents. The package cooperates with the abstract and \
titling packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7asvn19361"

RPM_NAME = "texlive-combine-2026.226.0.0.7asvn19361-60.2.noarch.rpm"
RPM_HASH = "d28760075d40abb1931494c8f10d2f74a8794babcf6525c665eeb58626d75109d5eeab098406fccf88bc3f15ade0cf3509d6306648bab1fc34bc64a609031613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-combcite.sty \
tex-combine.cls \
tex-combinet.sty \
tex-combnat.sty \
texlive-combine"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cite.sty \
tex-keyval.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
