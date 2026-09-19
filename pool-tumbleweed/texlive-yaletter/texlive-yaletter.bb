SUMMARY = "Extremely flexible macros for letters, envelopes, and label sheets"
DESCRIPTION = "The yaletter class provides extremely configurable macros for \
typesetting letters in any conceivable style. It provides \
facilities for maintaining easily-accessible databases of \
letterheads and addresses for repeat use. It further provides \
easy macros for envelopes and for label sheets. Finally, it \
provides some nice defaults for a few of the more common styles \
and sizes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn42830"

RPM_NAME = "texlive-yaletter-2026.226.1.1svn42830-59.4.noarch.rpm"
RPM_HASH = "bdcbb3dec85353b96f9c8fa454945513b7ed579d74909b1c95358392e5adb9954f29cc713d53eeb94ed85a6a3825d8673c7a5db2294de4aed6fb846da4f34050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yaletter.cls \
texlive-yaletter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-textpos.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
