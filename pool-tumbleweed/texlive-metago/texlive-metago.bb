SUMMARY = "MetaPost output of Go positions"
DESCRIPTION = "The package allows you to draw Go game positions with MetaPost. \
Two methods of usage are provided, either using the package \
programmatically, or using the package via a script (which may \
produce several images)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn78101"

RPM_NAME = "texlive-metago-2026.226.0.0.9svn78101-61.2.noarch.rpm"
RPM_HASH = "e54907f46fabf52056fef4290daf9d2b75454ba5db6d4dbef5754a8c9c70382940abb868224afbb76c4327c8cde17d9211507ef0bc90e0fced309111bc563443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metago"

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
