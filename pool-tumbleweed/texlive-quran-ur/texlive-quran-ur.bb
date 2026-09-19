SUMMARY = "Urdu translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some Urdu translations \
of the Holy Quran. It adds eight Urdu translations to the quran \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.23svn74829"

RPM_NAME = "texlive-quran-ur-2026.226.0.0.23svn74829-60.4.noarch.rpm"
RPM_HASH = "fd7f56cbb17141b8f407b1e29a7e420818727ba3965515bfbb359df0a7fa7cc34cf39269f7a841a4c2d95e69ee4987848de804c4421685a539fb7daae87505d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-ur.sty \
tex-qurantext-uri.translation.def \
tex-qurantext-urii.translation.def \
tex-qurantext-uriii.translation.def \
tex-qurantext-uriv.translation.def \
tex-qurantext-urv.translation.def \
tex-qurantext-urvi.translation.def \
tex-qurantext-urvii.translation.def \
tex-qurantext-urviii.translation.def \
texlive-quran-ur"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
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
