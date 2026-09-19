SUMMARY = "Hooks at the very end of a document"
DESCRIPTION = "This LaTeX package provides some wrapper commands around LaTeX \
end document hooks."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12svn77682"

RPM_NAME = "texlive-atveryend-2026.226.1.12svn77682-60.2.noarch.rpm"
RPM_HASH = "5861ec30c4181acf262b47477ef3fcfa6815748ede6e9ebd73fb5c7a51c0d6d64d71d8ae6b1ea6fb14009d4864446ff4ac771ac10a2bbf56be12feabe6d85e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atveryend.sty \
texlive-atveryend"

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
