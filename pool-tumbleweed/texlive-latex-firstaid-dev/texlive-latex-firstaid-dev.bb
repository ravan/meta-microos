SUMMARY = "Development pre-release of the LaTeX firstaid package"
DESCRIPTION = "This is a pre-release version of the standard LaTeX firstaid \
package. It accompanies the pre-testing kernel code \
(latex-base-dev), and is intended for testing by knowledgeable \
users."
LICENSE = "LPPL-1.0"

PV = "2026.226.pre_release_1svn77483"

RPM_NAME = "texlive-latex-firstaid-dev-2026.226.pre_release_1svn77483-63.2.noarch.rpm"
RPM_HASH = "f65c863de4fb154234e03fe79f7ceb60f5ca4f744c3aeff06a3ddfc4f761d203414546a6e8606bcde11b5d22f171132ca06445382cbb1e128498a1fe2431fac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-filehook-ltx.sty \
texdev-underscore-ltx.sty \
texlive-latex-firstaid-dev"

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
