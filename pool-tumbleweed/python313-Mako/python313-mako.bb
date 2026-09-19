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

RPM_NAME = "python313-Mako-1.4.1-1.1.noarch.rpm"
RPM_HASH = "85abe92c5198a827a2aacdc6fc4d9036c320a9959a822da835cdf34d873e8f4d33fc47a6397e5b2afdd0b9cd4678545a22d89d4a31ab7c45252a4e841f3860b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Mako \
python3-mako \
python3.13dist-mako \
python313-Mako \
python313-mako \
python3dist-mako"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-MarkupSafe"

inherit rpm
