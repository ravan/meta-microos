SUMMARY = "Include eXtensible Metadata Platform data in pdfLaTeX"
DESCRIPTION = "The XMP (eXtensible Metadata platform) is a framework to add \
metadata to digital material to enhance the workflow in \
publication. The essence is that the metadata is stored in an \
XML file, and this XML stream is then embedded in the file to \
which it applies. How you create this XML file is up to you, \
but the author started investigating this because he wanted to \
embed licensing information in the files he created. The \
license the author chose is one of the Creative Commons \
licenses, and their web-site offers this information in a valid \
XML-file, suitable for direct inclusion."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.4svn60593"

RPM_NAME = "texlive-xmpincl-2026.226.2.4svn60593-59.4.noarch.rpm"
RPM_HASH = "f04a0a5c40ac682b77076e4039c5f5c07283a4fc59453911f4d5c85691bad2c078ed5d8f7b5448729646b9d90c64a465821d28c1bad7a59e110e0160a7bebdd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xmpincl.sty \
texlive-xmpincl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
