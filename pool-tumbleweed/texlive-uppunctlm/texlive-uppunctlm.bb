SUMMARY = "Always keep upright shape for some punctuation marks and Arabic numerals"
DESCRIPTION = "The package provides a mechanism to keep punctuation always in \
upright shape even if italic was specified. It is directed to \
Latin Modern fonts, and provides .tfm, .vf, .fd, and .sty \
files. Here a list of punctuation characters always presented \
in upright shapes: comma, period, semicolon, colon, \
parentheses, square brackets, and Arabic numerals."
LICENSE = "LPPL-1.3c"

PV = "2026.226.0.0.1svn42334"

RPM_NAME = "texlive-uppunctlm-2026.226.0.0.1svn42334-60.2.noarch.rpm"
RPM_HASH = "5047f147f2864752cfceaeb76ca6157ea4d15567917b8d6844ed4040c60e4bfafd309baca7c447ac0e853400f77a78e2e9b78b840d9a3a32e083d2de2c0b64d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ec-uplmri10.tfm \
tex-ec-uplmri10.vf \
tex-ec-uplmri12.tfm \
tex-ec-uplmri12.vf \
tex-ec-uplmri7.tfm \
tex-ec-uplmri7.vf \
tex-ec-uplmri8.tfm \
tex-ec-uplmri8.vf \
tex-ec-uplmri9.tfm \
tex-ec-uplmri9.vf \
tex-t1uplmr.fd \
tex-uppunctlm.sty \
texlive-uppunctlm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ec-lmr10.tfm \
tex-ec-lmr12.tfm \
tex-ec-lmr7.tfm \
tex-ec-lmr8.tfm \
tex-ec-lmr9.tfm \
tex-ec-lmri10.tfm \
tex-ec-lmri12.tfm \
tex-ec-lmri7.tfm \
tex-ec-lmri8.tfm \
tex-ec-lmri9.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
