SUMMARY = "LaTeX macros for TUGboat articles"
DESCRIPTION = "Provides ltugboat.cls for both regular and proceedings issues \
of the TUGboat journal. Also provides a BibTeX style, \
tugboat.bst."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.36svn77682"

RPM_NAME = "texlive-tugboat-2026.226.2.36svn77682-59.2.noarch.rpm"
RPM_HASH = "0a7b34f61a41cc225ec0498c4da88d8aeb72cfc76506514c5d36b17437a7c6ee45756d23b6cdce64ab0597f19ee7adc05cea0afc58936f899289139f01d91722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltugboat.cls \
tex-ltugboat.sty \
tex-ltugcomn.sty \
tex-ltugproc.cls \
tex-ltugproc.sty \
texlive-tugboat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-gettitlestring.sty \
tex-mflogo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
