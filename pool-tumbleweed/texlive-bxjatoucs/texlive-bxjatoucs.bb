SUMMARY = "Convert Japanese character code to Unicode"
DESCRIPTION = "This package is meant for macro/package developers: It provides \
function-like (fully-expandable) macros that convert a \
character code value in one of several Japanese encodings to a \
Unicode value. Supported source encodings are: ISO-2022-JP \
(jis), EUC-JP (euc), Shift_JIS (sjis), and the Adobe-Japan1 \
glyph set."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn71870"

RPM_NAME = "texlive-bxjatoucs-2026.226.0.0.3asvn71870-59.2.noarch.rpm"
RPM_HASH = "73a8b033780da65ac2b371faa726bb7ac141d4b256b64b1ad66ced1e223bb54a1d8338bcffe89f4d1b863d7ee1487cff45459611ec952e435e5f1c8c50c3e5bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjatoucs-cid.tfm \
tex-bxjatoucs-jis.tfm \
tex-bxjatoucs-tojis.tfm \
tex-bxjatoucs.sty \
texlive-bxjatoucs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
