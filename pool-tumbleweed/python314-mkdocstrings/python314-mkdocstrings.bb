SUMMARY = "Automatic documentation from sources, for MkDocs"
DESCRIPTION = "Automatic documentation from sources, for [MkDocs](https://mkdocs.org/)."
LICENSE = "ISC"

PV = "1.0.6"

RPM_NAME = "python314-mkdocstrings-1.0.6-1.1.noarch.rpm"
RPM_HASH = "7441650bd693eee2c2a172606d911a559006380ef28eb39efc801540f1da06e6082e1d98c598fd97dba059d96a65df535f49bec174725a923bfc3f2fbf846305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mkdocstrings \
python314-mkdocstrings \
python3dist-mkdocstrings"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-Markdown \
python314-MarkupSafe \
python314-mkdocs \
python314-mkdocs-autorefs \
python314-pymdown-extensions"

inherit rpm
