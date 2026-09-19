SUMMARY = "Extract and reinsert PDF annotations with pdfTeX"
DESCRIPTION = "If PDF files are included using pdfTeX, PDF annotations are \
stripped. The pax project offers a solution without altering \
pdfTeX. A Java program (pax.jar) parses the PDF file that will \
later be included. The program then writes the data of the \
annotations into a file that can be read by TeX. The LaTeX \
package pax extends the graphics package to support the scheme: \
if a PDF file is included, the package looks for the file with \
the annotation data, reads them and puts the annotations in the \
right place. Project status: experimental"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63509"

RPM_NAME = "texlive-pax-2026.226.svn63509-58.2.noarch.rpm"
RPM_HASH = "745a4242a407396df83485f6dd3b482aafe299678dab36d42e6cd90a085797d3e9118a214e88e71cda2fb770b2d792ea97f7125181f3fbedffad0dc88b7fa00e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pax.jar \
tex-pax.sty \
texlive-pax"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
perl-File--Which \
perl-Getopt--Long \
perl-strict \
sed \
tex-auxhook.sty \
tex-etexcmds.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pax-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
