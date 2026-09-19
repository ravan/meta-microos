SUMMARY = "An extended commonmark compliant parser, with bridges to docutils & sphinx"
DESCRIPTION = "MyST is a flavor of markdown that is designed for simplicity, flexibility, and extensibility. \
This is the reference implementation of MyST Markdown, as well as a collection of tools to support working with MyST in Python and Sphinx. \
It contains an extended CommonMark (https://commonmark.org)-compliant parser using markdown-it-py (https://markdown-it-py.readthedocs.io/), as well as a Sphinx (https://www.sphinx-doc.org) extension that allows to write MyST Markdown in Sphinx."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python314-myst-parser-5.1.0-1.1.noarch.rpm"
RPM_HASH = "d645788c4088d84f2a2a004b572bf718eea17de384b1c45dbedef85ff81f45b2fd710c4c50e8f35408472fb8cb89b971fafe00db23750f2b79ab043fa6b7fbe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-myst-parser \
python314-myst-parser \
python3dist-myst-parser"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Jinja2 \
python314-PyYAML \
python314-Sphinx \
python314-docutils \
python314-markdown-it-py \
python314-mdit-py-plugins"

inherit rpm
