SUMMARY = "German translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some German \
translations of the Holy Quran. It adds three more German \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21svn74874"

RPM_NAME = "texlive-quran-de-2026.226.0.0.21svn74874-60.4.noarch.rpm"
RPM_HASH = "2f666ec20a27c9abc93734203d2f7800f3bedc1d192401ada10442a9083dd9aec2ea98f7ad4ca33b0d0913fa7398a56cc3104bbedf2e926042009673e161ab18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-de.sty \
tex-qurantext-deii.translation.def \
tex-qurantext-deiii.translation.def \
tex-qurantext-deiv.translation.def \
texlive-quran-de"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-quran.sty \
tex-qurantext-de.translation.def \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
