SUMMARY = "A Python implementation of Markdown"
DESCRIPTION = "Markdown2 is a Python implementation of Markdown. \
It closely matches the behaviour of the original \
Perl-implemented Markdown.pl. Markdown2 also comes with a number of \
extensions (called 'extras') for things like syntax coloring, tables, \
header-ids."
LICENSE = "MIT"

PV = "2.5.5"

RPM_NAME = "python313-markdown2-2.5.5-1.3.noarch.rpm"
RPM_HASH = "ba8826f687243c71be7306ebcf310e3b850010495f247da10df85d84c5c5a429fdc52fe686b57ff2d66fa9986532334c792e11c05062f8fe2c0230f2b7e6cede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-markdown2 \
python3.13dist-markdown2 \
python313-markdown2 \
python3dist-markdown2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
