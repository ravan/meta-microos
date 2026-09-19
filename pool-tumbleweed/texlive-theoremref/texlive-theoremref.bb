SUMMARY = "References with automatic theorem names"
DESCRIPTION = "The theoremref package provides variants of the \\label and \\ref \
commands for theorem-like environments, capable of \
automatically typesetting references including the theorem name \
(apart from the theorem number). The scheme is particularly \
valuable if the author decides to change a lemma to a \
proposition or a theorem (or whatever)."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn77682"

RPM_NAME = "texlive-theoremref-2026.227.svn77682-62.2.noarch.rpm"
RPM_HASH = "77e104a357ea2a10c310550225e96d226807b54d730625ef82d6a72de726cf24e4f080b8ce712fcc5e5483f337b37b2effa0dfebd65e6beb12e79fef302c91f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-theoremref.sty \
texlive-theoremref"

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
