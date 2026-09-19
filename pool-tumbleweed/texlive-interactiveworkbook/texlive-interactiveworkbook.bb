SUMMARY = "LaTeX-based interactive PDF on the Web"
DESCRIPTION = "The package interactiveworkbook gives the user the ability to \
write LaTeX documents which, ultimately, create interactive \
question-and-answer Portable Document Format (PDF) tutorials \
meant to be used by Internet students and that, in particular, \
freely use mathematical notation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-interactiveworkbook-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "98a132333e2443df2160ed4ac58524b1a989b3f6c306312d52c3f4b2b3ff6fd019624e3514705be74d6e2f9d0bd52f51cdba09b541edb0276d28b7469eac7817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interactiveworkbook-web.sty \
tex-interactiveworkbook.sty \
texlive-interactiveworkbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-epsfig.sty \
tex-ifthen.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
