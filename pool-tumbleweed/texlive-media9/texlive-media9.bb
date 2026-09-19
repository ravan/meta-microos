SUMMARY = "Multimedia inclusion package with Adobe Reader-9/X compatibility"
DESCRIPTION = "The package provides an interface to embed interactive Flash \
(SWF) and 3D objects (Adobe U3D & PRC), as well as video and \
sound files or streams in the popular MP4, FLV and MP3 formats \
into PDF documents with Acrobat-9/X compatibility. Playback of \
multimedia files uses the built-in Flash Player of Adobe Reader \
and does, therefore, not depend on external plug-ins. Flash \
Player supports the efficient H.264 codec for video \
compression. The package is based on the RichMedia Annotation, \
an Adobe addition to the PDF specification. It replaces the now \
obsolete movie15 package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.30svn76924"

RPM_NAME = "texlive-media9-2026.226.1.30svn76924-59.2.noarch.rpm"
RPM_HASH = "91910cbdc60a88ef55d6a88ec0df300d7a176f477439a47af439cd98a3d7901775c9647607121db0be1ec70a0c31f990fbec4aa6d51714225378acad60bcea97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-media9.sty \
tex-pdfbase.sty \
texlive-media9"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ocgbase.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
