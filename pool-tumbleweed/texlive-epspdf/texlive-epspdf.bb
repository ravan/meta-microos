SUMMARY = "Converter for PostScript, EPS and PDF"
DESCRIPTION = "Epspdftk.tcl is a GUI ps/eps/pdf converter. Epspdf.tlu, its \
command-line backend, can be used by itself. Options include \
grayscaling, cropping margins and single-page selection. Some \
conversion options are made possible by converting in multiple \
steps."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.6.5.2svn74487"

RPM_NAME = "texlive-epspdf-2026.226.0.0.6.5.2svn74487-61.4.noarch.rpm"
RPM_HASH = "4455088f47a636a2d6eacd7581bac3d07818c67f95963cf0a7575488245bb7d6261ecffb07195fcec4458b04cec33ac55f247068b243b841a8b3378adf8157ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdf"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
/usr/bin/wish \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-epspdf-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
