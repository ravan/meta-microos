SUMMARY = "Manage the options and loading order of other packages"
DESCRIPTION = "The package seeks to address the frustration caused by package \
conflicts. It is in an early stage of its development, and \
should probably not be used as a matter of course; however the \
author welcomes feedback via the home page link given in this \
catalogue entry. Nevertheless, the author urges users to try \
the package and to report issues (or whatever) via the \
package's repository. To use pkgloader you need, apart from \
packages installed by default, the lt3graph package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.0svn76924"

RPM_NAME = "texlive-pkgloader-2026.226.0.0.7.0svn76924-58.2.noarch.rpm"
RPM_HASH = "4abbb2639c98c50208b7c4b58a74a1ff23f42d84af96f0166c15ea3bb4cec3ccc8575c2ee15a028b4d9104bd8e2146cc52a28afeed7e5886ddcb048285195c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pkgloader-cls-pkg.sty \
tex-pkgloader-dry.sty \
tex-pkgloader-early.sty \
tex-pkgloader-error.sty \
tex-pkgloader-false.sty \
tex-pkgloader-late.sty \
tex-pkgloader-recommended.sty \
tex-pkgloader-true.sty \
tex-pkgloader.sty \
texlive-pkgloader"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-filecontents.sty \
tex-l3keys2e.sty \
tex-lt3graph.sty \
tex-withargs.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
