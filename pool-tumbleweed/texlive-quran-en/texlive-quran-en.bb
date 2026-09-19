SUMMARY = "English translation extension to the quran package"
DESCRIPTION = "This package is designed for typesetting multiple English \
translations of the Holy Quran. It adds 15 additional English \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn74874"

RPM_NAME = "texlive-quran-en-2026.226.0.0.11svn74874-60.4.noarch.rpm"
RPM_HASH = "6f7e9c35dfdff1e7212c2a86b0655f5e226cb0c71a02fff52b633e79efa506ff15c00d256a226b4997b1a1739931712f7051bcc30fb5d5080ecccf4e2b770aea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-en.sty \
tex-qurantext-enii.translation.def \
tex-qurantext-eniii.translation.def \
tex-qurantext-eniv.translation.def \
tex-qurantext-enix.translation.def \
tex-qurantext-env.translation.def \
tex-qurantext-envi.translation.def \
tex-qurantext-envii.translation.def \
tex-qurantext-enviii.translation.def \
tex-qurantext-enx.translation.def \
tex-qurantext-enxi.translation.def \
tex-qurantext-enxii.translation.def \
tex-qurantext-enxiii.translation.def \
tex-qurantext-enxiv.translation.def \
tex-qurantext-enxv.translation.def \
tex-qurantext-enxvi.translation.def \
texlive-quran-en"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-quran.sty \
tex-qurantext-en.translation.def \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
