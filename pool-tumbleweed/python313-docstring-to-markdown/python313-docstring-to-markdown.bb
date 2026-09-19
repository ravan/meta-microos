SUMMARY = "On the fly conversion of Python docstrings to markdown"
DESCRIPTION = "On the fly conversion of Python docstrings to markdown \
  - Python 3.7+ \
  - currently can recognise reStructuredText and convert \
    multiple of its features to Markdown \
  - in the future will be able to convert Google docstrings too"
LICENSE = "LGPL-2.1-or-later"

PV = "0.17"

RPM_NAME = "python313-docstring-to-markdown-0.17-1.2.noarch.rpm"
RPM_HASH = "c1dc6cd54d8ed35d3e2792d87627bf5fcab4a1592cab216c89ee5aa1bcc47ef53d6a3142d8feee3bc52fc37224e8a0379223ffda52ab021deff9ebe88c25c694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docstring-to-markdown \
python3.13dist-docstring-to-markdown \
python313-docstring-to-markdown \
python3dist-docstring-to-markdown"

RDEPENDS:${PN} += "python-abi \
python313-importlib-metadata \
python313-typing-extensions"

inherit rpm
