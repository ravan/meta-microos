SUMMARY = "Typeset SAS or R code or output"
DESCRIPTION = "The SASnRdisplay package serves as a front-end to listings, \
which permits statisticians and others to import source code \
and the results of their calculations or simulations into LaTeX \
projects. The package is also capable of overloading the Sweave \
User Manual and SASweave packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.95svn63255"

RPM_NAME = "texlive-sasnrdisplay-2026.226.0.0.95svn63255-60.2.noarch.rpm"
RPM_HASH = "2af77792b587e3bc7a411414dc240cae3191d5a79f30950521a409fe8ec7ce8e148284235070f8353202ad42e1afb9962159428cc16e823c473090514b9f9a7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-SASnRdisplay.cfg \
tex-SASnRdisplay.sty \
texlive-sasnrdisplay"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-etoolbox.sty \
tex-listings.sty \
tex-needspace.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
