SUMMARY = "Templates for the student organization at OST FH, Switzerland"
DESCRIPTION = "This package is made by the student organization at the \
University of Applied Sciences of Eastern Switzerland \
(Ostschweizer Fachhochschule) to provide an easy to use \
interface for newbies and give a more consistent look and feel \
to the works produced by the organization's members. This \
package also contains hsrstud.{ins,dtx} which is the older \
version of the oststud package before the school changed its \
name in 2021. We would like to keep it for backwards \
compatibility when compiling old documents that have not been \
migrated yet."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn67217"

RPM_NAME = "texlive-oststud-2026.226.0.0.4svn67217-61.2.noarch.rpm"
RPM_HASH = "c4cb4a7ce314796db14ecebaf546bbc998a4f4f29a05aa15777a91fb724f2ea7f960b0c52ec98ea6c5cdea6da039ca2adb1bf25b9891cc2ec19b1ce8d4abe073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hsrbericht.cls \
tex-hsrstud.sty \
tex-hsrzf.cls \
tex-oststud.sty \
texlive-oststud"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-article.cls \
tex-bm.sty \
tex-cmbright.sty \
tex-concmath.sty \
tex-esint.sty \
tex-esvect.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-roboto.sty \
tex-sfmath.sty \
tex-titling.sty \
tex-totpages.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
