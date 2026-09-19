SUMMARY = "Samples from Math into LaTeX, 4th Edition"
DESCRIPTION = "Samples for the book `(More) Math into LaTeX', 4th edition. In \
addition, there are two excerpts from the book: A Short Course \
to help you get started quickly with LaTeX, including detailed \
instructions on how to install LaTeX on a PC or a Mac; Math and \
Text Symbol Tables."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44131"

RPM_NAME = "texlive-math-into-latex-4-2026.226.svn44131-59.2.noarch.rpm"
RPM_HASH = "a7a86b683ac3b3a2e5b4e16fa6a56211b6a0814de3c12308c10c8b520eb7f07f42ba5ae3148bccf8aea4aed795a1a85434feac1411fcb8cee082f4da4cb9c2a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-math-into-latex-4"

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
