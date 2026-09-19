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

RPM_NAME = "python313-python-lsp-server-1.14.0-3.2.noarch.rpm"
RPM_HASH = "843c772f18760a708140cdbe1d853eaf5fabf84436664d029da02b754af22f81ff2807b6ae8252da043a568268e27b5601eb0966d7825eeb197bc7ff16fdc0f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-server \
python3.13dist-python-lsp-server \
python313-python-lsp-server \
python3dist-python-lsp-server"

RDEPENDS:${PN} += "-python313-python-lsp-jsonrpc >= 1.1.0 with python313-python-lsp-jsonrpc < 2 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-black \
python313-docstring-to-markdown \
python313-jedi \
python313-pluggy \
python313-ujson"

inherit rpm
