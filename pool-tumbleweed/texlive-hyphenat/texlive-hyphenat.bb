SUMMARY = "Disable/enable hyphenation"
DESCRIPTION = "This package can disable all hyphenation or enable hyphenation \
of non-alphabetics or monospaced fonts. The package can also \
enable hyphenation within 'words' that contain non-alphabetic \
characters (e.g., that include underscores), and hyphenation of \
text typeset in monospaced (e.g., cmtt) fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3csvn77682"

RPM_NAME = "texlive-hyphenat-2026.226.2.3csvn77682-60.2.noarch.rpm"
RPM_HASH = "022b2b75082eb2ae7bce391d4d88eae1ffab3003ac9e4315d4e7b732cee7c69c84c108947c577ef301d1d55b41761894ab824e4ec92a8278ec23f2fbab5d999b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyphenat.sty \
texlive-hyphenat"

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
