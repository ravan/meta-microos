SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "3.4.0"

RPM_NAME = "python311-jupyter-ydoc-3.4.0-2.2.noarch.rpm"
RPM_HASH = "d2a9c2e7cd40089e40eac55715a18b44bcde95cfe50aa8c3e301504f6c7bd9128ec91e620c058209eae0d79620865a787d7116ca763b12e02d5933f4edd5ed93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jupyter-ydoc \
python311-jupyter-ydoc \
python3dist-jupyter-ydoc"

RDEPENDS:${PN} += "-python311-anyio >= 4.12.1 with python311-anyio < 5 \
-python311-pycrdt >= 0.10.1 with python311-pycrdt < 0.13 \
python-abi"

inherit rpm
