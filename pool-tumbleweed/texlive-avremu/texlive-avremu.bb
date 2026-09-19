SUMMARY = "An 8-Bit Microcontroller Simulator written in LaTeX"
DESCRIPTION = "A fully working package to simulate a Microprocessor in pure \
LaTeX. The simulator is able to calculate complex pictures, \
like Mandelbrot sets."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn71991"

RPM_NAME = "texlive-avremu-2026.226.0.0.1svn71991-60.2.noarch.rpm"
RPM_HASH = "a79e50527d3fa19215bebee06783249cc824baf575d5c593fa1888b9d28aaee1333fdba3a9751e2086db62c578020cfce34bc72850fe3dd5638905511f200931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-avr.binary.tex \
tex-avr.bitops.tex \
tex-avr.draw.tex \
tex-avr.instr.tex \
tex-avr.io.tex \
tex-avr.memory.tex \
tex-avr.numbers.tex \
tex-avr.testsuite.tex \
tex-avremu.sty \
texlive-avremu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
