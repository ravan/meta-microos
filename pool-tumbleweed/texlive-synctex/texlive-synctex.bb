SUMMARY = "Engine-level feature synchronizing output and source"
DESCRIPTION = "SyncTeX allows navigating between the TeX source and (usually \
PDF) output, in both directions, given a SyncTeX-aware front \
end. It is compiled into most engines and can be enabled with \
the --synctex=1 option. It is developed as part of TeX Live."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn66203"

RPM_NAME = "texlive-synctex-2026.226.svn66203-64.2.noarch.rpm"
RPM_HASH = "7799682fea626431244ec56782c754bddfc516f55b443e35ada01954b9e4c1fd4c91f19680860c3be9bc6b27a28c3563ee90aada8099c11497981de426549aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-synctex.1 \
man-synctex.5 \
texlive-synctex"

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
texlive-scripts-bin \
texlive-synctex-bin"

inherit rpm
