SUMMARY = "Alternate quotes between double and single with nesting"
DESCRIPTION = "Provides two new commands: \\nlq and \\nrq for nesting left and \
right quotes that properly change between double and single \
quotes according to their nesting level. For example, the input \
\\nlq Foo \\nlq bar\\nrq\\ bletch\\nrq will be typeset as if it had \
been entered as 'Foo 'bar' bletch'."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn27323"

RPM_NAME = "texlive-nestquot-2026.226.svn27323-61.2.noarch.rpm"
RPM_HASH = "f781391d55790e26be04b81be4e13e6c56e5cb9fb9130f44d4d306168f8c5d25c0500061307947e17788b3442a4e38b02bfd48bca75662f8b2f55e1544aa9b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nestquot.sty \
texlive-nestquot"

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
