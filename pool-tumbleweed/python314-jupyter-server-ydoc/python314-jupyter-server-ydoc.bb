SUMMARY = "Jupyter server extension integrating collaborative shared models"
DESCRIPTION = "jupyter-server extension integrating collaborative shared models. \
 \
The collaborative shared models are used for both: \
- real time collaboration, and \
- server-side execution of notebooks"
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python314-jupyter-server-ydoc-2.4.0-1.4.noarch.rpm"
RPM_HASH = "1fa90aef66e3076d72ea470bfbd773a27d166375aecf2fdcf1231cb259a27f596624160765adaaae1f54e528774247949bd713114099fb0c78de6022f814906e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-server-ydoc \
python314-jupyter-server-ydoc \
python3dist-jupyter-server-ydoc"

RDEPENDS:${PN} += "-python314-jupyter-server >= 2.15.0 with python314-jupyter-server < 3.0 \
-python314-jupyter-server-fileid >= 0.7.0 with python314-jupyter-server-fileid < 1 \
-python314-jupyter-ydoc >= 3.0.3 with python314-jupyter-ydoc < 4 \
-python314-pycrdt-websocket >= 0.16.0 with python314-pycrdt-websocket < 0.17 \
jupyter-server-ydoc \
python-abi \
python314-jsonschema \
python314-jupyter-events \
python314-pycrdt"

inherit rpm
