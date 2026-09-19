SUMMARY = "Access metadata from the git distributed version control system"
DESCRIPTION = "The package makes it possible to incorporate git version \
control metadata into documents. For memoir users, the package \
provides the means to tailor page headers and footers to use \
the metadata. Note this version is now deprecated, but is kept \
on the archive, pro tem, for continuity for existing users. All \
new repositories should use gitinfo2."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn34049"

RPM_NAME = "texlive-gitinfo-2026.226.1.0svn34049-60.4.noarch.rpm"
RPM_HASH = "4682db229cbd8ab55317d1cd88a813b8651e47cf5a1c4383e4211a42615e8dbb09ef473aa27c2db7b5f7651f833129526e92b701783826684f72262ea9a1ab4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitinfo.sty \
tex-gitsetinfo.sty \
texlive-gitinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
