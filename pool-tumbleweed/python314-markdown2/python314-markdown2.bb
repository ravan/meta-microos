SUMMARY = "A Python implementation of Markdown"
DESCRIPTION = "Markdown2 is a Python implementation of Markdown. \
It closely matches the behaviour of the original \
Perl-implemented Markdown.pl. Markdown2 also comes with a number of \
extensions (called 'extras') for things like syntax coloring, tables, \
header-ids."
LICENSE = "MIT"

PV = "2.5.5"

RPM_NAME = "python314-markdown2-2.5.5-1.3.noarch.rpm"
RPM_HASH = "40e04984955fcd55c8d35658f63d73a33d4fcc45418627ad7030ca1f61a4ba8b8eef3a7038fc0a057eb2e6909bcd30dc49dd439f80b86f1928d7aecd262a7e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-markdown2 \
python314-markdown2 \
python3dist-markdown2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
