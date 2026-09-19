SUMMARY = "Python Language Server for the Language Server Protocol"
DESCRIPTION = "Python Language Server for the Language Server Protocol \
 \
Fork of the python-language-server project, maintained by \
the Spyder IDE team and the community \
 \
If the respective recommended packages are installed, the following optional providers \
will be enabled: \
 \
- Rope for Completions and renaming \
- Pyflakes linter to detect various errors \
- McCabe linter for complexity checking \
- pycodestyle linter for style checking \
- pydocstyle linter for docstring style checking (disabled by default) \
- autopep8 for code formatting \
- YAPF for code formatting (preferred over autopep8)"
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python314-python-lsp-server-1.14.0-3.2.noarch.rpm"
RPM_HASH = "eb8b210be7437dd91f814df7a5f62631d90af5b49c5572b77fabc0b53249a579e5b2c220093fd5615747a212d0d07330c7bb478483e56565a68685ffe987aa21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-lsp-server \
python314-python-lsp-server \
python3dist-python-lsp-server"

RDEPENDS:${PN} += "-python314-python-lsp-jsonrpc >= 1.1.0 with python314-python-lsp-jsonrpc < 2 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-black \
python314-docstring-to-markdown \
python314-jedi \
python314-pluggy \
python314-ujson"

inherit rpm
