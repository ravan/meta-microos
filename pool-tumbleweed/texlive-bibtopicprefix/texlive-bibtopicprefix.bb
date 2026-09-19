SUMMARY = "Prefix references to bibliographies produced by bibtopic"
DESCRIPTION = "The package permits users to apply prefixes (fixed strings) to \
references to entries in bibliographies produced by the \
bibtopic package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn15878"

RPM_NAME = "texlive-bibtopicprefix-2026.226.1.10svn15878-61.2.noarch.rpm"
RPM_HASH = "a0409d56a82503d2c6650af1480d8ab2df22b2d5d6c4f7df608b277ac0fc4210d73aa06c0aaf369524c3c24960355b24cf340f9cdda320d54685300b6240d5e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibtopicprefix.sty \
texlive-bibtopicprefix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibtopic.sty \
tex-scrlfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
