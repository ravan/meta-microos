SUMMARY = "Convert footnotes to endnotes"
DESCRIPTION = "Defines macros \\makeendnotes, which converts \\footnote to \
produce endnotes; and \\theendnotes which prints them out."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-fn2end-2026.226.1.1svn15878-60.2.noarch.rpm"
RPM_HASH = "9c00bce6eac9278d5b316da85593471f1aebbd2ee2a5b3812e8f72f3a7fdc9afb6b9f720f3d145a2a0d3b13740662c66eec9ebe7dbb58420541cb4d3e86c48d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fn2end.sty \
texlive-fn2end"

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
