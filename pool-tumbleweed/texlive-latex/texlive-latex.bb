SUMMARY = "A TeX macro package that defines LaTeX"
DESCRIPTION = "LaTeX is a widely-used macro package (format) for TeX, \
providing many basic document formatting commands extended by a \
wide range of packages. It was originally created by Leslie \
Lamport, whose last release was LaTeX 2.09. The current LaTeX \
superseded that release in June 1994. The basic distribution is \
catalogued separately, at latex-base. Apart from a large set of \
contributed packages and third-party documentation (elsewhere \
on the archive), the distribution includes: a number of \
required packages, which LaTeX authors may assume will be \
present on any system running LaTeX; and a minimal set of \
documentation detailing differences from the 'old' version of \
LaTeX in the areas of user commands, font selection and \
control, class and package writing, font encodings, \
configuration options and modification of LaTeX. For \
downloading details, documentation links, etc., see the linked \
catalogue entries above."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-latex-2026.226.svn76924-63.2.noarch.rpm"
RPM_HASH = "b2be63952e1ece630d6280d60db0a6f0788a8e6426294cedec8f0b7657edc598584e3455162134c89220c513dc9674f0e768100daac29ede76d8037d1cb92f73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alltt.sty \
tex-ansinew.def \
tex-applemac.def \
tex-article.cls \
tex-article.sty \
tex-ascii.def \
tex-atbegshi-ltx.sty \
tex-atveryend-ltx.sty \
tex-bezier.sty \
tex-bk10.clo \
tex-bk11.clo \
tex-bk12.clo \
tex-book.cls \
tex-book.sty \
tex-checkencodingsubset.tex \
tex-cp1250.def \
tex-cp1252.def \
tex-cp1257.def \
tex-cp437.def \
tex-cp437de.def \
tex-cp850.def \
tex-cp852.def \
tex-cp858.def \
tex-cp865.def \
tex-decmulti.def \
tex-doc-2016-02-15.sty \
tex-doc-2021-06-01.sty \
tex-doc.sty \
tex-docstrip.tex \
tex-exscale.sty \
tex-fix-cm.sty \
tex-fixltx2e.sty \
tex-flafter.sty \
tex-fleqn.clo \
tex-fleqn.sty \
tex-fltrace.sty \
tex-fontenc.sty \
tex-fontmath.cfg \
tex-fonttext.cfg \
tex-graphpap.sty \
tex-idx.tex \
tex-ifthen.sty \
tex-inputenc.sty \
tex-lablst.tex \
tex-latex209.def \
tex-latexrelease.sty \
tex-latexsym.sty \
tex-latin1.def \
tex-latin10.def \
tex-latin2.def \
tex-latin3.def \
tex-latin4.def \
tex-latin5.def \
tex-latin9.def \
tex-leqno.clo \
tex-leqno.sty \
tex-letter.cls \
tex-letter.sty \
tex-lppl.tex \
tex-ltluatex.tex \
tex-ltnews.cls \
tex-ltxcheck.tex \
tex-ltxdoc.cfg \
tex-ltxdoc.cls \
tex-ltxguide.cls \
tex-macce.def \
tex-makeidx.sty \
tex-minimal.cls \
tex-newlfont.sty \
tex-next.def \
tex-nfssfont.tex \
tex-oldlfont.sty \
tex-omlcmm.fd \
tex-omlcmr.fd \
tex-omlenc.def \
tex-omllcmm.fd \
tex-omscmr.fd \
tex-omscmsy.fd \
tex-omsenc.def \
tex-omslcmsy.fd \
tex-omxcmex.fd \
tex-omxlcmex.fd \
tex-openbib.sty \
tex-ot1cmdh.fd \
tex-ot1cmfib.fd \
tex-ot1cmfr.fd \
tex-ot1cmr.fd \
tex-ot1cmss.fd \
tex-ot1cmtt.fd \
tex-ot1cmvtt.fd \
tex-ot1enc.def \
tex-ot1lcmss.fd \
tex-ot1lcmtt.fd \
tex-ot4enc.def \
tex-preload.cfg \
tex-proc.cls \
tex-proc.sty \
tex-report.cls \
tex-report.sty \
tex-sample2e.tex \
tex-sfonts.def \
tex-shortvrb.sty \
tex-showidx.sty \
tex-size10.clo \
tex-size11.clo \
tex-size12.clo \
tex-slides.cls \
tex-slides.def \
tex-slides.sty \
tex-small2e.tex \
tex-source2edoc.cls \
tex-structuredlog.sty \
tex-syntonly.sty \
tex-t1cmdh.fd \
tex-t1cmfib.fd \
tex-t1cmfr.fd \
tex-t1cmr.fd \
tex-t1cmss.fd \
tex-t1cmtt.fd \
tex-t1cmvtt.fd \
tex-t1enc.def \
tex-t1enc.sty \
tex-t1lcmss.fd \
tex-t1lcmtt.fd \
tex-testpage.tex \
tex-texsys.cfg \
tex-textcomp-2018-08-11.sty \
tex-textcomp.sty \
tex-tracefnt.sty \
tex-ts1cmr.fd \
tex-ts1cmss.fd \
tex-ts1cmtt.fd \
tex-ts1cmvtt.fd \
tex-ts1enc.def \
tex-tuenc.def \
tex-tulmdh.fd \
tex-tulmr.fd \
tex-tulmss.fd \
tex-tulmssq.fd \
tex-tulmtt.fd \
tex-tulmvtt.fd \
tex-ucmr.fd \
tex-ucmss.fd \
tex-ucmtt.fd \
tex-ulasy.fd \
tex-ullasy.fd \
tex-utf8-2018.def \
tex-utf8.def \
texlive-latex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hypdoc.sty \
tex-hyperref.sty \
tex-l3doc.cls \
tex-multicol.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
