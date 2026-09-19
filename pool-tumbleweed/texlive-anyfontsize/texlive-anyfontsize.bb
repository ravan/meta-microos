SUMMARY = "Select any font size in LaTeX"
DESCRIPTION = "The package allows the to user select any font size (via e.g. \
\\fontsize{...}{...}\\selectfont), even those sizes that are not \
listed in the .fd file. If such a size is requested, LaTeX will \
search for and select the nearest listed size; anyfontsize will \
then scale the font to the size actually requested. Similar \
functionality is available for the CM family, for the EC \
family, or for either computer modern encoding; the present \
package generalises the facility."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-anyfontsize-2026.226.svn78101-61.2.noarch.rpm"
RPM_HASH = "e39771717bafe4d78ac7b41495ce1add36bfaab2204620aa7c563ef677df0d38e34940fb37efcf203c3b46017bb5defb15050c511656fd22c539bb45a06dcd9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-anyfontsize.sty \
texlive-anyfontsize"

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
