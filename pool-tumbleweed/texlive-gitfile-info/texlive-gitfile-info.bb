SUMMARY = "Get git metadata for a specific file"
DESCRIPTION = "If you are using git to control versions of LaTeX-files, you \
may want to show yourself or other users or devs the current \
version of the file, information about the author and last \
edited date. All packages for git known make that kind of \
information available for the whole repository. But sometimes \
you have a lot of files within the same repository in different \
versions, from different authors etc. Perhaps you also split up \
a big project in small files and want to show within the \
document who had edited what. This package gives you the \
opportunity to do so."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn51928"

RPM_NAME = "texlive-gitfile-info-2026.226.0.0.5svn51928-60.4.noarch.rpm"
RPM_HASH = "218e54801fc0a8e6a6f5dc59dd17353df9515244e0015901ed43a32622f7f93ac2ddf655555f6c664e0fbacbe13620a2bce8cc534d07713ef3894c5ae0c9238c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitfile-info.sty \
texlive-gitfile-info"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-tcolorbox.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
