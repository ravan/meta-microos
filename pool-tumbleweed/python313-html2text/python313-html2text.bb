SUMMARY = "Python script for turning HTML into Markdown text"
DESCRIPTION = "html2text is a Python script that converts a page of HTML into \
Markdown (a text-to-HTML format)."
LICENSE = "GPL-3.0-only"

PV = "2025.4.15"

RPM_NAME = "python313-html2text-2025.4.15-1.6.noarch.rpm"
RPM_HASH = "1a276c54d85416121111d2860ca79139f390f99a8f34e385a2b22dc8882a881bdfabe3cd5fd0898d8f79359c82396815d100a0572b4d05d5f227d0a8330966a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "html2text \
python3-html2text \
python3.13dist-html2text \
python313-html2text \
python3dist-html2text"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
