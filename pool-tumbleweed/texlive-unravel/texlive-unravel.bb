SUMMARY = "Watching TeX digest tokens"
DESCRIPTION = "The aim of this LaTeX package is to help debug complicated \
macros. This is done by letting the user step through the \
execution of some TeX code, going through the details of nested \
expansions, performing assignments, as well as some simple \
typesetting commands. To use this package, one should normally \
run TeX in a terminal. The unravel package requires up-to-date \
versions of the l3kernel, l3packages and l3experimental \
bundles."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3csvn77682"

RPM_NAME = "texlive-unravel-2026.226.0.0.3csvn77682-60.2.noarch.rpm"
RPM_HASH = "e61647849e3c520d3fa89a53c742ed6060fd7f54793eb262b92c5688fc4634e91879af245c8ec8add63bb68305de2807458cce195fb58bae5af448d49970c784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unravel.sty \
texlive-unravel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-gtl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
