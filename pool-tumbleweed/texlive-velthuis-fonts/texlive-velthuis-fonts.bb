SUMMARY = "Severed fonts for texlive-velthuis"
DESCRIPTION = "The  separated fonts package for texlive-velthuis"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.17.1svn66186"

RPM_NAME = "texlive-velthuis-fonts-2026.226.2.17.1svn66186-60.2.noarch.rpm"
RPM_HASH = "a6dcc9be4e1934c14608c72a7fd329667c1b8eac9e2601fd4162518fa1db236220c2570491ddd863a3ba2816fb27a448bd8fbba801c6ecf98cbf5641a438ab2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-velthuisdevanagari \
texlive-velthuis-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
