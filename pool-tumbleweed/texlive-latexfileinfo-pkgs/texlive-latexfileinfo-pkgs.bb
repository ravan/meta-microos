SUMMARY = "A comparison of packages showing LaTeX file information"
DESCRIPTION = "The package provides an HTML file that lists and compares CTAN \
packages that display LaTeX source file information from \
\\ProvidesClass, \\ProvidesFile, and \\ProvidesPackage commands in \
the LaTeX file. Five packages of the author's, and several \
other packages are discussed; revision control systems are \
mentioned briefly."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.22svn26760"

RPM_NAME = "texlive-latexfileinfo-pkgs-2026.226.0.0.22svn26760-61.2.noarch.rpm"
RPM_HASH = "e78fe42fd152798f46b3d4f305d8b34e87cc34f177605cee035e675e0eb728d8732be06a093e0ed99029d6a5fec0f797255da6fe92f2ad469dd00d4d6109b660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileinfo-pkgs"

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
