SUMMARY = "Simplifying the use of common figures"
DESCRIPTION = "The package provides the command \\Figure[<key=value>...]{<image \
filename>} to simplify the business of including an image as \
figure in the most common form (centred and with caption and \
label). Caption and label are set using the caption and label \
keys; the label fig:<image filename> is used if none is given. \
If the here key is given, the figure is not 'floated', and the \
user is responsible for placement. The package uses the \
author's package adjustbox to centre an image and to simplify \
further modifications. As adjustbox now provides keys to turn \
images or other material into floats or non-floats, including \
captions, easyfig has become quite redundant."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn77682"

RPM_NAME = "texlive-easyfig-2026.226.1.2asvn77682-61.4.noarch.rpm"
RPM_HASH = "239d069b466a34b374e7af6a175567fd5ad16640e35e730f08434f1b1abdef75eeee624a4a1684bc3dc6255fbdd9096b1b73cb63f31d11466a0fd4534fc642ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easyfig.sty \
texlive-easyfig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-ifetex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
