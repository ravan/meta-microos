SUMMARY = "Bengali translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some Bengali \
translations of the Holy Quran. It adds two Bengali \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21svn74830"

RPM_NAME = "texlive-quran-bn-2026.226.0.0.21svn74830-60.4.noarch.rpm"
RPM_HASH = "24e9c00726392cdec443e83e4958dce25c0f04335e1d98305fef57ed76d9d8ae0e29fda6929178a2f9d1b31f45cea1f0c3b7f7e7cd15584b84aaa753a92e7225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-bn.sty \
tex-qurantext-bni.translation.def \
tex-qurantext-bnii.translation.def \
texlive-quran-bn"

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
