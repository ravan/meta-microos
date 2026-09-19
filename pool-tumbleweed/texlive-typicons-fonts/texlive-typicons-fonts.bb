SUMMARY = "Severed fonts for texlive-typicons"
DESCRIPTION = "The  separated fonts package for texlive-typicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.7svn77682"

RPM_NAME = "texlive-typicons-fonts-2026.226.2.0.7svn77682-59.2.noarch.rpm"
RPM_HASH = "ac2565a5a2eb8e9f74ce8892c48580b2f3ab1737eab14e8b4f4a82006a59f3315cd1696783e1feca15ed55a2da8dce5e74a23c4f169ca9c77f2b3b2dd56859a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-typicons \
texlive-typicons-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
