SUMMARY = "Textile processing for python"
DESCRIPTION = "This is a Python implementation of the Textile \
(http://textism.com/tools/textile) markup language. \
 \
Textile is a XHTML generator using a simple markup developed by Dean \
Allen. This is a Python port with support for code validation, itex to \
MathML translation, Python code coloring and much more."
LICENSE = "BSD-3-Clause"

PV = "4.0.4"

RPM_NAME = "python314-textile-4.0.4-1.2.noarch.rpm"
RPM_HASH = "c4fa3583dd60ea89e584504223c84de04ace17c4bd4028d908638ccc86b43f62d8b983774bac59c0ab3b7c253bc1d95b0cb419e3c3bdc6805a8f13e6508eb801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-textile \
python314-textile \
python3dist-textile"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-nh3 \
python314-regex \
update-alternatives"

inherit rpm
