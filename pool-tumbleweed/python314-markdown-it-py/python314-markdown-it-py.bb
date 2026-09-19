SUMMARY = "Python port of markdown-it Markdown parsing"
DESCRIPTION = "This is a Python port of [markdown-it], and some of its associated plugins. \
 \
It follows the CommonMark spec for baseline parsing, has a configurable syntax and is pluggable."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python314-markdown-it-py-4.2.0-1.2.noarch.rpm"
RPM_HASH = "c592db3e58393a7880b3a1152bdd035f10bcd93c4f5ea75cab87b9daab845f87fb43a13b43b07d6743bbd1362fc8835d5b21569fa2d73fe9f0d1c4bd814972f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-markdown-it-py \
python314-markdown-it-py \
python3dist-markdown-it-py"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-mdurl"

inherit rpm
