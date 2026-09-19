SUMMARY = "A package to help change page layout parameters in LaTeX"
DESCRIPTION = "The package lets you change page layout parameters in small \
steps over a range of values using options. It can set \
\\textwidth appropriately for the main fount, and ensure that \
the text fits inside the printable area of a printer. An \
rmpage-formatted document can be typeset identically without \
rmpage after a single cut and paste operation. Local \
configuration can set defaults: for all documents; and by \
class, by printer, and by paper size. The geometry package is \
better if you want to set page layout parameters to particular \
measurements."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.92svn54080"

RPM_NAME = "texlive-rmpage-2026.226.0.0.92svn54080-60.4.noarch.rpm"
RPM_HASH = "a58b44fb4402a1176268082a12bdbdc9904c1cc6e3161da142540658dcc21815a52e11b2d925e441f98a95af09b0a85471c3e626350cf1fd2f4aa91fd1a57f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rmpage.sty \
tex-rmpgen.cfg \
texlive-rmpage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-avant.sty \
tex-beton.sty \
tex-bookman.sty \
tex-chancery.sty \
tex-helvet.sty \
tex-newcent.sty \
tex-palatino.sty \
tex-times.sty \
tex-utopia.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
