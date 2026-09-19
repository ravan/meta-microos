SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "python314-nbclassic-1.3.3-2.2.noarch.rpm"
RPM_HASH = "399c44a5dfec9f66c233e6a9ff941b4c9d6e140ae48c0ce05f5f2dea2ffc5b12a475438b027ffb90a38700bb9d3d7dd677821f66f38a58a4e4e80a80ea1c056e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nbclassic \
python314-nbclassic \
python3dist-nbclassic"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
jupyter-nbclassic \
python-abi \
python314-ipykernel \
python314-ipython-genutils \
python314-nest-asyncio \
python314-notebook-shim"

inherit rpm
