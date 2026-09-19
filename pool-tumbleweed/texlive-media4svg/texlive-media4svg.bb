SUMMARY = "Multimedia inclusion for the dvisvgm backend"
DESCRIPTION = "This package implements an interface for embedding video and \
audio files in SVG (Scalable Vector Graphics) output. SVG with \
embedded media is very portable, as it is supported by all \
modern Web browsers across a variety of operating systems and \
platforms, including portable devices. All DVI producing TeX \
engines can be used. The dvisvgm utility, which is part of all \
major TeX distributions, converts the intermediate DVI to SVG. \
By default, media files are embedded into the SVG output to \
make self-sufficient SVG files."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13svn76924"

RPM_NAME = "texlive-media4svg-2026.226.0.0.13svn76924-59.2.noarch.rpm"
RPM_HASH = "57b2987181c140885cce56bbeda8c796dbf4dd786cc22c8ae8d12bfa0a97ff182c7024bd2448fe00528b3450c8a984044d8d56b8b4df8d3c4f4a06ed7bd9972f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-media4svg.sty \
texlive-media4svg"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdfbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
