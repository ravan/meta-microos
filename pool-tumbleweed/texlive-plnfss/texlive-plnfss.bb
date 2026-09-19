SUMMARY = "Font selection for Plain TeX"
DESCRIPTION = "Plnfss is a set of macros to provide easy font access (somewhat \
similar to NFSS but with some limitations) with Plain TeX. \
Plnfss can automatically make use of PSNFSS fd files, i.e., \
when an Adobe Type 1 is used the relevant fd file will be \
loaded automatically. For cmr-like fonts (ec, vnr, csr or plr \
fonts), a special format called pfd (plain fd) is required and \
must be loaded manually. See ot1cmr.pfd for further \
information."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-plnfss-2026.226.1.1svn15878-59.2.noarch.rpm"
RPM_HASH = "ddcef15dde843f4728b8e96f131d9a66288a2a79e267aae8fba7c9bd75d08b0164e52421e03842fbc9e65c001176da8b014bbf29529e9a2b9f6cc2349cb71f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-MIKmathf.tex \
tex-plnfss.tex \
texlive-plnfss"

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
