SUMMARY = "Download OpenStreetMap maps for use in documents"
DESCRIPTION = "The package provides a simple interface to OpenStreetMap, and \
to Google Maps 'map images'. In the simplest case, it is \
sufficient to specify the address you need (if you don't, the \
package will use its own default). The package loads the map \
image using an external lua script (invoked via \\write 18: \
LaTeX must be running with \\write 18 enabled). The ('external') \
lua script may be used from the command line; a bash version is \
provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11svn75447"

RPM_NAME = "texlive-getmap-2026.226.1.11svn75447-60.2.noarch.rpm"
RPM_HASH = "ca36db4c5e1f178fc8fcf675675e8908dcd4bc2161569ab7c366327bc5459337eea66da8066c1247b5df6cf15bb74ca616d6ace8c10581f76991f5bca14b7c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-getmap.cfg \
tex-getmap.sty \
texlive-getmap"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-shellesc.sty \
tex-stringenc.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-getmap-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
