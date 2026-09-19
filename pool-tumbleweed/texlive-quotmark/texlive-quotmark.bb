SUMMARY = "Consistent quote marks"
DESCRIPTION = "The package provides a means of ensuring consistent quote marks \
throughout your document. The style can be changed either via \
package option or command, and the package detects language \
selections (from the babel or ngerman packages), and uses the \
punctuation marks appropriate for the current language. The \
author now considers the package obsolete, and recommends use \
of csquotes in its place."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-quotmark-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "71bb94261a79a88f4ef620f48887a8e391f3fc45406f2e697223430a7e552aa61c9a2da3ae9bd0f934d3f97d8ef58201537a624d856a36e745493b8eb69e9dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quotmark-UKenglish.def \
tex-quotmark-USenglish.def \
tex-quotmark-afrikaans.def \
tex-quotmark-brazil.def \
tex-quotmark-bulgarian.def \
tex-quotmark-catalan.def \
tex-quotmark-croatian.def \
tex-quotmark-czech.def \
tex-quotmark-danish.def \
tex-quotmark-dutch.def \
tex-quotmark-estonian.def \
tex-quotmark-finnish.def \
tex-quotmark-frenchb.def \
tex-quotmark-germanb.def \
tex-quotmark-greek.def \
tex-quotmark-hebrew.def \
tex-quotmark-icelandic.def \
tex-quotmark-irish.def \
tex-quotmark-italian.def \
tex-quotmark-magyar.def \
tex-quotmark-ngermanb.def \
tex-quotmark-norsk.def \
tex-quotmark-polish.def \
tex-quotmark-portuges.def \
tex-quotmark-romanian.def \
tex-quotmark-russianb.def \
tex-quotmark-serbian.def \
tex-quotmark-slovak.def \
tex-quotmark-slovene.def \
tex-quotmark-sorbian.def \
tex-quotmark-spanish.def \
tex-quotmark-swedish.def \
tex-quotmark-swiss.def \
tex-quotmark-turkish.def \
tex-quotmark-ukraineb.def \
tex-quotmark-welsh.def \
tex-quotmark.sty \
texlive-quotmark"

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
