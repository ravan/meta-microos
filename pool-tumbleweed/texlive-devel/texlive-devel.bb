SUMMARY = "Basic development packages for TeXLive"
DESCRIPTION = "This package will cause the installation of several \
development packages for TeXLive."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2026.222"

RPM_NAME = "texlive-devel-2026.222-68.2.noarch.rpm"
RPM_HASH = "ec3f66535dbbc900bd51eff883eabf8c88c2d097afc09f77fa280eac32291e4e43469c59d0cf84784306902b07f5067b1507773226f29b9e932e01e43dcc5c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-devel"

RDEPENDS:${PN} += "texlive-bin-devel \
texlive-cweb \
texlive-kpathsea-devel \
texlive-ptexenc-devel \
texlive-synctex-devel \
texlive-texlua-devel \
texlive-web"

inherit rpm
