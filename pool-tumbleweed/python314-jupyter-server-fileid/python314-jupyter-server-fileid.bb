SUMMARY = "File IDs for documents in a running Jupyter Server"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python314-jupyter-server-fileid-0.9.3-1.8.noarch.rpm"
RPM_HASH = "d4dd25198f0e58e7505eee4a9a2d0de56b42381a87e986a809af7ad2313c62a90a8c32e1614cb43d60b345bb053ccfabca2104a992487a9e044c45d31a7f1bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-server-fileid \
python314-jupyter-server-fileid \
python3dist-jupyter-server-fileid"

RDEPENDS:${PN} += "-python314-jupyter-server >= 1.15 with python314-jupyter-server < 3 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
jupyter-server-fileid \
python-abi \
python314-jupyter-events"

inherit rpm
