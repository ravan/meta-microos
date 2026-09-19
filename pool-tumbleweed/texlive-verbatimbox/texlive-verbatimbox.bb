SUMMARY = "Deposit verbatim text in a box"
DESCRIPTION = "The package provides a verbbox environment (which uses \
techniques similar to those of the boxedverbatim environment of \
the moreverb package) to place its contents into a globally \
available box, or into a box specified by the user. The global \
box may then be used in a variety of situations (for example, \
providing a replica of the boxedverbatim environment itself). A \
valuable use is in places where the standard verbatim \
environment (which is based on a trivlist) may not appear. The \
package makes use of the verbatim package (which is a required \
part of any LaTeX distribution)."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn77682"

RPM_NAME = "texlive-verbatimbox-2026.226.3.2svn77682-60.2.noarch.rpm"
RPM_HASH = "d3ec998e57a3b55d41d22d41336931ea698cd9905f8926da6db35ae3bb6c8aa8812532f199436b2268b75697cccac7f4fd3062a1f8278e3329898b3b3582ec43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verbatimbox.sty \
texlive-verbatimbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-readarray.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
