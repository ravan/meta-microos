SUMMARY = "Extends the hyperref package with a mechanism for hyperlinked URLs abbreviated with prefixes"
DESCRIPTION = "Semantic Web resource URLs are often abbreviated with prefixes, \
like owl:Class or rdf:type. The abbreviated URL (aurl) package \
provides the correct hyperlinks for those URLs. The 1000 most \
common prefixes are predefined and more can be added."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn75878"

RPM_NAME = "texlive-aurl-2026.226.svn75878-60.2.noarch.rpm"
RPM_HASH = "2fddc3a9aed785bf724f69df1401d3730f6677464433748d769c9ff974c59b63a11e4c011b891c3860bf31e9c6ba8122d41ace864916c34430529341dda725d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aurl.sty \
texlive-aurl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
