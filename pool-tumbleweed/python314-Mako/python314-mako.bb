SUMMARY = "A Python templating language"
DESCRIPTION = "Mako is a template library written in Python. It provides a non-XML \
syntax which compiles into Python modules for performance. Mako's \
syntax and API borrows from Django templates, Cheetah, Myghty, and \
Genshi. Conceptually, Mako is an embedded Python (i.e. Python Server \
Page) language, which refines the ideas of componentized layout and \
inheritance, while maintaining close ties to Python calling and \
scoping semantics."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python314-Mako-1.4.1-1.1.noarch.rpm"
RPM_HASH = "482590bd7a39891c50bbe40b5c9da6fa5f92ac52393821f1760ff7ba89ca013c7de35f083a6f669699d9b81f631ec186bbe75d8f2d015dca5f498e81f20e5056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mako \
python314-Mako \
python314-mako \
python3dist-mako"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-MarkupSafe"

inherit rpm
