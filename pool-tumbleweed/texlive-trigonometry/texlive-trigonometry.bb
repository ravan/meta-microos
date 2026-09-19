SUMMARY = "Demonstration code for cos and sin in TeX macros"
DESCRIPTION = "A document that both provides macros that are usable elsewhere, \
and demonstrates the macros. The code uses the 'classical' \
analytical expansion of sin and cos (the more recent trig uses \
a 'numerical analyst's' expansion)."
LICENSE = "SUSE-TeX"

PV = "2026.226.svn43006"

RPM_NAME = "texlive-trigonometry-2026.226.svn43006-59.2.noarch.rpm"
RPM_HASH = "bfd0b9188c9cf8bcc91d3323725bc521372c2db35a62a5f0842e87e0d33c0fc29f12c1ec5a46616858471158ee6f8ce52977d6a6969555395487362351d353ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trigonometry.tex \
texlive-trigonometry"

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
