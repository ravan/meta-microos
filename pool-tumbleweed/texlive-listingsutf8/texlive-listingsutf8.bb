SUMMARY = "Allow UTF-8 in listings input"
DESCRIPTION = "Package listings does not support files with multi-byte \
encodings such as UTF-8. In the case of \\lstinputlisting, a \
simple workaround is possible if a one-byte encoding exists \
that the file can be converted to. The package requires the \
e-TeX extensions under pdfTeX (in either PDF or DVI output \
mode)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn53097"

RPM_NAME = "texlive-listingsutf8-2026.226.1.5svn53097-61.2.noarch.rpm"
RPM_HASH = "a3de20bebef0d8921fb78899fe02e6f85c11d296adaa339ccc4817f2c442d99a01537f346eebf30b206f39c6fffa3417deb5aaba0c64b0af7d2a94782403b5d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listingsutf8.sty \
texlive-listingsutf8"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-inputenc.sty \
tex-listings.sty \
tex-pdftexcmds.sty \
tex-stringenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
