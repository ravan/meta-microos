SUMMARY = "Plotting dart boards"
DESCRIPTION = "pst-dart is a PSTricks related package and draws Dart Boards. \
Optional arguments are the unit and the fontsize."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn60476"

RPM_NAME = "texlive-pst-dart-2026.226.0.0.03svn60476-59.2.noarch.rpm"
RPM_HASH = "a5e2b9a2830ff843bca625ea5e63911fbc2cf54fa2052abba41ee0375f20ea0bf3b27cf91ef7fe204fffac27975fa8a823f04a05f9710971ffd410647ebaaae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-dart.sty \
tex-pst-dart.tex \
texlive-pst-dart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
