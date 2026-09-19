SUMMARY = "Extended references to items for enumitem package"
DESCRIPTION = "The package is a companion for the enumitem package; it makes \
it possible to reference any item in lists formatted by \
enumitem lists, viz., enumerated, itemize and description \
lists, and any list defined (or customised) with \\newlist or \
\\setlist. References may be typeset differently with \
options/properties and even arbitrary text. With hyperref, \
anchors are added for each item to enable hyperlinks within the \
document or even to external documents. Three schemes are \
provided to make reference names (including the standard \\label \
command). The package is currently broken, cf. \
https://tex.stackexchange.com/q/664886/1090"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn75712"

RPM_NAME = "texlive-enumitem-zref-2026.226.1.8svn75712-61.4.noarch.rpm"
RPM_HASH = "f94445a3f03bd4a168bd0078680317ffe076fe8fa35b795498806260c8b69d00237e27315336e7be76c945f8e7cdb4f9986a0b1eedeecf7d03d9bcc2191b5617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enumitem-zref.sty \
texlive-enumitem-zref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-engrec.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-gettitlestring.sty \
tex-greekctr.sty \
tex-kvoptions.sty \
tex-ltxcmds.sty \
tex-zref-counter.sty \
tex-zref-user.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
