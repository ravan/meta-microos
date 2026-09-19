SUMMARY = "Add interactive Barcode fields to PDF forms"
DESCRIPTION = "The package extends the hyperref functionality for creating \
interactive forms to allow adding Barcode form fields supported \
by some modern PDF readers. Currently, only pdfTeX is \
supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn48147"

RPM_NAME = "texlive-hyperbar-2026.226.0.0.1svn48147-60.2.noarch.rpm"
RPM_HASH = "2ae38b4700dfad2311e1484508ad2e3bf1f10fab2c53a57c4257d699f6c355c55a41fafa45a72db42378e19133da299a7a7871fb93a04e3b2b3457c42e09d0c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyperbar.sty \
texlive-hyperbar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
