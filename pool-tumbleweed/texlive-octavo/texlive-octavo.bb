SUMMARY = "Typeset books following classical design and layout"
DESCRIPTION = "The octavo class is a modification of the standard LaTeX book \
class. Its purpose is to typeset books following classical \
design and layout principles, with the express intention of \
encouraging the making of beautiful books by anyone with access \
to a good printer and with an inclination towards venerable \
crafts, e.g., bookbinding. The octavo class differs from the \
book class by implementing many of the proposals and insights \
of respected experts, especially Jan Tschichold and Hugh \
Williamson. The documentation discusses methods to organise and \
print out any text into signatures, which can then be gathered, \
folded and sewn into a book."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-octavo-2026.226.1.2svn15878-61.2.noarch.rpm"
RPM_HASH = "d053ea3cb60173f081d62725be2c9b28c1b01a2cd8de68872f11023ecbd1ded0880bfedcfda7d407b6a7b14d19d690ac8a1fb6eaaceddb6eb812233ba1ffcce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oct10.clo \
tex-oct11.clo \
tex-oct12.clo \
tex-octavo.cls \
texlive-octavo"

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
