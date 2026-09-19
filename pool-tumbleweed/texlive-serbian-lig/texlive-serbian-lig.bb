SUMMARY = "Control ligatures in Serbian"
DESCRIPTION = "The package suppresses fi and fl (and other ligatures) in \
Serbian text written using Roman script."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn53127"

RPM_NAME = "texlive-serbian-lig-2026.226.svn53127-60.2.noarch.rpm"
RPM_HASH = "72d48fad052f4fa74e7a9202cd71a63e7d531e4ccd1c3d5fa503aefb1ad8bc0835dcadb2874cc2b2cc31fff2779c5ce48764869bc650ac8481925c938a1ceb10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbian-lig.sty \
texlive-serbian-lig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
