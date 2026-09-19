SUMMARY = "Improve Latvian language support in XeLaTeX"
DESCRIPTION = "The package offers improvement of the Latvian language support \
in polyglossia, in particular in the area of the standard \
classes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1asvn21631"

RPM_NAME = "texlive-fixlatvian-2026.226.1asvn21631-59.2.noarch.rpm"
RPM_HASH = "8395558caa087850ffc83d14001fee0888e3ee381ca571b285a68805b3493287012b3302a277be0dd895305a2ed872e1c7a842019078db9831ebd459d6d1c974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixlatvian.sty \
texlive-fixlatvian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-etoolbox.sty \
tex-icomma.sty \
tex-indentfirst.sty \
tex-perpage.sty \
tex-polyglossia.sty \
tex-svn-prov.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
