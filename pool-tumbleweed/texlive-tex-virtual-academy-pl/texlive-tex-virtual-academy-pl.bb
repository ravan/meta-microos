SUMMARY = "TeX usage web pages, in Polish"
DESCRIPTION = "TeX Virtual Academy is a bundle of Polish documentation in HTML \
format about TeX and Co. It contains information for beginners, \
LaTeX packages, descriptions, etc."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.227.svn67718"

RPM_NAME = "texlive-tex-virtual-academy-pl-2026.227.svn67718-62.2.noarch.rpm"
RPM_HASH = "4f6882f809079333425a9911a3e3d3d349685665ddaa37f4c7dabce808cb441f604d7a8e155847f849550d2f46c82feacf2c9765028a5e4da18fa87d66c99bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-virtual-academy-pl"

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
