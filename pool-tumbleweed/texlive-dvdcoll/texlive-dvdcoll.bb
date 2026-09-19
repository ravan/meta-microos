SUMMARY = "A class for typesetting DVD archives"
DESCRIPTION = "Having lost the overview of my DVD archives, I simply could not \
remember if I already recorded the documentary running on TV \
that day. I chose to recreate the index using LaTeX: the design \
aim was a hyperlinked and fully searchable PDF-document, \
listing my DVDs with all titles, lengths and so on. Further \
requirements were support for seasons of tv series and a list \
with all faulty or missing programs for rerecording. The \
dvdcoll class supports all these requirements. dvdcoll.cls \
follows the structure <number><title><length>. As a result, the \
class is not limited to DVDs--you can of course typeset \
archives of CD-ROMs, Audio-CDs and so on. Supported languages \
at the moment: English, French, German, Italian, Polish, \
Portuguese, Spanish. Some help is needed for other languages!"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn15878"

RPM_NAME = "texlive-dvdcoll-2026.226.1.1asvn15878-61.4.noarch.rpm"
RPM_HASH = "13c870892e21745426e0a3bbc1be4ec1a052b950167f444c15711cc8cb430a28c323a41de0330d1037bb4b7d91f91159d6c777fc972d2f52ce65c11f771ea39a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dcwrtbib.sty \
tex-dvdcoll.cls \
tex-pdfnotiz.sty \
texlive-dvdcoll"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-array.sty \
tex-booktabs.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-marginnote.sty \
tex-multicol.sty \
tex-ragged2e.sty \
tex-scrreprt.cls \
tex-tabularx.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
