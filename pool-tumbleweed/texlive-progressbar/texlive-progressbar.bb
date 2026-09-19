SUMMARY = "Visualize shares of total amounts in the form of a (progress-)bar"
DESCRIPTION = "This package allows you to easily visualize shares of total \
amounts in the form of a bar. So basically you can convert any \
number between 0 and 1 to a progressbar using the command \
\\progressbar{<number>}. Also a lot of customizations are \
possible, allowing you to create an unique progressbar on your \
own. The package uses TikZ to produce its graphics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0b_4svn33822"

RPM_NAME = "texlive-progressbar-2026.226.1.0b_4svn33822-59.2.noarch.rpm"
RPM_HASH = "ebb59bbffd5d476200dd96878996b7c0d5187aba749e9fe61ceba884b3012dd872eddf56d059e1b8411af63f8984664b593bc21f2fd68ea0b18bb53fbd7c09c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-progressbar.sty \
texlive-progressbar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
