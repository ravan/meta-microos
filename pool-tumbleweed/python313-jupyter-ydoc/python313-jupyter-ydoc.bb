SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "python313-jupyter-ydoc-3.5.0-1.2.noarch.rpm"
RPM_HASH = "ebc7b134e6516a5e8bc52b8dc5c19f6331d7ce5732ab00b38ff4aaa3fa18e13ba069a17b5cf449d70026a034a6f1f5c6227e77735d77fd67d8b4593315e4bfdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-ydoc \
python3.13dist-jupyter-ydoc \
python313-jupyter-ydoc \
python3dist-jupyter-ydoc"

RDEPENDS:${PN} += "-python313-anyio >= 4.12.1 with python313-anyio < 5 \
-python313-pycrdt >= 0.10.1 with python313-pycrdt < 0.13 \
python-abi"

inherit rpm
