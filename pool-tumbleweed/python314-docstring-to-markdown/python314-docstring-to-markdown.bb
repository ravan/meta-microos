SUMMARY = "On the fly conversion of Python docstrings to markdown"
DESCRIPTION = "On the fly conversion of Python docstrings to markdown \
  - Python 3.7+ \
  - currently can recognise reStructuredText and convert \
    multiple of its features to Markdown \
  - in the future will be able to convert Google docstrings too"
LICENSE = "LGPL-2.1-or-later"

PV = "0.17"

RPM_NAME = "python314-docstring-to-markdown-0.17-1.2.noarch.rpm"
RPM_HASH = "5554fea79f2b6e94bd6facc14b3ea3af2a1f55a42469737ac8268ed4f60149bacda8117ad13d5fd662e99b5a0926ceec571ae30335da36dff1e9be7216fefd92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-docstring-to-markdown \
python314-docstring-to-markdown \
python3dist-docstring-to-markdown"

RDEPENDS:${PN} += "python-abi \
python314-importlib-metadata \
python314-typing-extensions"

inherit rpm
