SUMMARY = "Python port of markdown-it Markdown parsing"
DESCRIPTION = "This is a Python port of [markdown-it], and some of its associated plugins. \
 \
It follows the CommonMark spec for baseline parsing, has a configurable syntax and is pluggable."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python313-markdown-it-py-4.2.0-1.2.noarch.rpm"
RPM_HASH = "6a72491bbbe387c383d1f331d44b2bbf1baccbe711cc86746022b6df95f53b4d6167418d1962d32ce40531a0823639131e8d654840d64385f1c8cc7507255d47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-markdown-it-py \
python3.13dist-markdown-it-py \
python313-markdown-it-py \
python3dist-markdown-it-py"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-mdurl"

inherit rpm
