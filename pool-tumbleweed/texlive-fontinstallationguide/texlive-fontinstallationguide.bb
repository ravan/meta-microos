SUMMARY = "Font installation guide"
DESCRIPTION = "This guide discusses the most common scenarios you are likely \
to encounter when installing Type 1 PostScript fonts. While the \
individual tools employed in the installation process are \
documented well, the actual difficulty most users are facing \
when trying to install new fonts is understanding how to put \
all the pieces together. This is what this guide is about."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.2.14svn59755"

RPM_NAME = "texlive-fontinstallationguide-2026.226.2.14svn59755-60.2.noarch.rpm"
RPM_HASH = "91e6a6de0cbe7c50dd84ea9eaf1d4fa0a24ad9040ecc1dd326f4ccc323433d176f01cf9c93c4c16dca5016efd3bc01f5aa6e63d663207fb193e095b5c4bc7944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontinstallationguide"

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
