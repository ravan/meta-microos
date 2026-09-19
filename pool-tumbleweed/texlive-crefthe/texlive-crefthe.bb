SUMMARY = "Cross referencing with proper definite articles and declensions"
DESCRIPTION = "By default, when using cleveref's \\cref to reference \
theorem-like environments, the names do not contain definite \
articles. In languages such as French, Italian, Portuguese, \
Spanish, etc. this results in incorrect grammar. For this \
purpose, the current package offers \\crefthe, which handles the \
definite articles properly (especially for the article \
contractions in many European languages)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-crefthe-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "44990dc7c76e02fed63fbdc4b1f0600946a3cf10d13b23d0218eddc06facc93a93fa9d5d499395b51dc49f7135ba276a2048b43c53e781bb7a5a21cffd4d670f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crefthe.sty \
texlive-crefthe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cleveref.sty \
tex-regexpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
