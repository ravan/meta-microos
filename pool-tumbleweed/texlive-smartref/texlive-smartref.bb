SUMMARY = "Extend LaTeX's \\ref capability"
DESCRIPTION = "The package extends the LaTeX labelling system: whenever a \
label is set, the values of counters (selected by the user) are \
recorded, along with the label. The value of these counters can \
be recalled with a command similar to \\pageref. The package \
also adds commands \\s[name]ref (for each counter [name] that \
the user has selected); these commands display something only \
if the value of the [name] counter is changed from when the \
label was set. Many commands are provided to serve as a macro \
programming environment for using the extended labels."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn77682"

RPM_NAME = "texlive-smartref-2026.226.1.9svn77682-64.2.noarch.rpm"
RPM_HASH = "791e3ba1af63689918817da194467399df477a2ccdd954338d90510b412a55cdc1229f045eb40d344fca7aaba95eb6d18d5a7e6e9ed23ef1cb7770fec97dbc25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-byname.sty \
tex-smartref.sty \
texlive-smartref"

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
