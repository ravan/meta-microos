SUMMARY = "An extended commonmark compliant parser, with bridges to docutils & sphinx"
DESCRIPTION = "MyST is a flavor of markdown that is designed for simplicity, flexibility, and extensibility. \
This is the reference implementation of MyST Markdown, as well as a collection of tools to support working with MyST in Python and Sphinx. \
It contains an extended CommonMark (https://commonmark.org)-compliant parser using markdown-it-py (https://markdown-it-py.readthedocs.io/), as well as a Sphinx (https://www.sphinx-doc.org) extension that allows to write MyST Markdown in Sphinx."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python313-myst-parser-5.1.0-1.1.noarch.rpm"
RPM_HASH = "9514cc6ef2938e5422705579bd8c16945b873aa00f4aafff557da13be9a885856b69fb79d688ab97344a238189695365387c586a16fc12ef54e370aab2f61972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-myst-parser \
python3.13dist-myst-parser \
python313-myst-parser \
python3dist-myst-parser"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Jinja2 \
python313-PyYAML \
python313-Sphinx \
python313-docutils \
python313-markdown-it-py \
python313-mdit-py-plugins"

inherit rpm
