SUMMARY = "Jupyter server extension integrating collaborative shared models"
DESCRIPTION = "jupyter-server extension integrating collaborative shared models. \
 \
The collaborative shared models are used for both: \
- real time collaboration, and \
- server-side execution of notebooks"
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python313-jupyter-server-ydoc-2.4.0-1.4.noarch.rpm"
RPM_HASH = "3a77e3b3a023986f0452455a1a7a6e3ba00f0c9094883b8bf87a68efa38fbbe5e14716a7677df8c78aac500877d2fde16312b2c712a31fb3ff02f832d081afcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-ydoc \
python3.13dist-jupyter-server-ydoc \
python313-jupyter-server-ydoc \
python3dist-jupyter-server-ydoc"

RDEPENDS:${PN} += "-python313-jupyter-server >= 2.15.0 with python313-jupyter-server < 3.0 \
-python313-jupyter-server-fileid >= 0.7.0 with python313-jupyter-server-fileid < 1 \
-python313-jupyter-ydoc >= 3.0.3 with python313-jupyter-ydoc < 4 \
-python313-pycrdt-websocket >= 0.16.0 with python313-pycrdt-websocket < 0.17 \
jupyter-server-ydoc \
python-abi \
python313-jsonschema \
python313-jupyter-events \
python313-pycrdt"

inherit rpm
