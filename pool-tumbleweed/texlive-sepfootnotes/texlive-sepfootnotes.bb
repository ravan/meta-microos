SUMMARY = "Support footnotes and endnotes from separate files"
DESCRIPTION = "The package supports footnotes and endnotes from separate \
files. This is achieved with commands \\sepfootnotecontent and \
\\sepfootnote; the former defines the content of a note, while \
the latter typesets that note."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3dsvn77682"

RPM_NAME = "texlive-sepfootnotes-2026.226.0.0.3dsvn77682-60.2.noarch.rpm"
RPM_HASH = "1918304099d6097ec89f4c60582a84ca0a27867f2119ef9b0ac23694b4e13ee04cedc771ad0186a0b90934dcebb64bdee0df23278801757e308f6048d12df86d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sepfootnotes.sty \
texlive-sepfootnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
