SUMMARY = "Indonesian translation extension to the quran package"
DESCRIPTION = "The package is prepared for typesetting some Indonesian \
translations of the Holy Quran. It adds two Indonesian \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn74874"

RPM_NAME = "texlive-quran-id-2026.226.0.0.11svn74874-60.4.noarch.rpm"
RPM_HASH = "bcae3329e5bb88d99bf82493cbc0f1da51dbf8d5274e7b2918dd3fa5918b330ee286b4b80807d91032dca74422dcc75848f69da6a57e7c346753da352c592c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-id.sty \
tex-qurantext-idi.translation.def \
tex-qurantext-idii.translation.def \
texlive-quran-id"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-quran.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
