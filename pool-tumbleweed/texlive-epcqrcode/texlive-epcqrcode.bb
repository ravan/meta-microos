SUMMARY = "Generate valid EPC QR codes"
DESCRIPTION = "This package is a wrapper for the qrcode package. It can be \
used to generate valid EPC QR codes by providing syntax and \
validity checks, e.g. verifying the correctness of the IBAN."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-epcqrcode-2026.226.1.2svn76924-61.4.noarch.rpm"
RPM_HASH = "1ae215cd5bede35b109a9f224a15dc12924edf01bc04f60f3a939212122259bb91b8a687ca5db710a4d8ca0e5f05ea371ce87f4c24218e4549f1d4a2e7a93f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epcqrcode.sty \
texlive-epcqrcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calculator.sty \
tex-qrcode.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
