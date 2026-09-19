SUMMARY = "A collection of logos with bookmark support"
DESCRIPTION = "The package defines a single command \\hologo, whose argument is \
the usual case-confused ASCII version of the logo. The command \
is bookmark-enabled, so that every logo becomes available in \
bookmarks without further work."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.16svn77682"

RPM_NAME = "texlive-hologo-2026.226.1.16svn77682-60.4.noarch.rpm"
RPM_HASH = "ec7f1e716ff4e3f74cb2fc2863d8ab05bf6e810a9f476b0fb15b50d73963606b0dba24ed34ab12d8b9239775db4a6b7a1766f08b8b830dfa796deffa071ea2ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hologo.sty \
texlive-hologo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-infwarerr.sty \
tex-kvdefinekeys.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-ltxcmds.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
