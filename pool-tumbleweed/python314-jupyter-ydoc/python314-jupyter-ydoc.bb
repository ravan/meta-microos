SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "python314-jupyter-ydoc-3.5.0-1.2.noarch.rpm"
RPM_HASH = "06982eaf3bded1988dfa50b2e28253c1d8aba1a3950a4ea0e717eb6d9a0c0652d484969c1c9b27a460ea30833024fe5367d0708854bcab0978e46f4d48a03283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-ydoc \
python314-jupyter-ydoc \
python3dist-jupyter-ydoc"

RDEPENDS:${PN} += "-python314-anyio >= 4.12.1 with python314-anyio < 5 \
-python314-pycrdt >= 0.10.1 with python314-pycrdt < 0.13 \
python-abi"

inherit rpm
