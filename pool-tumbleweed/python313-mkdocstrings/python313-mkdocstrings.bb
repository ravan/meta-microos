SUMMARY = "Automatic documentation from sources, for MkDocs"
DESCRIPTION = "Automatic documentation from sources, for [MkDocs](https://mkdocs.org/)."
LICENSE = "ISC"

PV = "1.0.6"

RPM_NAME = "python313-mkdocstrings-1.0.6-1.1.noarch.rpm"
RPM_HASH = "b1a4d1aaea1210ecc7f6e01ef99d0e4fe8dc536e9e793e6d2e26c5f5f6d148d14940568377ede5c925c228d20706d46228fc5420ad6771b081f53624b83d2412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocstrings \
python3.13dist-mkdocstrings \
python313-mkdocstrings \
python3dist-mkdocstrings"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-Markdown \
python313-MarkupSafe \
python313-mkdocs \
python313-mkdocs-autorefs \
python313-pymdown-extensions"

inherit rpm
