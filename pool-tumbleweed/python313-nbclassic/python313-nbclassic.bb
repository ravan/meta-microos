SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "python313-nbclassic-1.3.3-2.2.noarch.rpm"
RPM_HASH = "f4983c5b9a6539416fdb38d3cdf4e0609f357e4f2a4b7978acc911004e938245126b1bf61354bff502f00542a8f416c7700aa4b27e2ef4273e812fcc5d3acb8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nbclassic \
python3.13dist-nbclassic \
python313-nbclassic \
python3dist-nbclassic"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
jupyter-nbclassic \
python-abi \
python313-ipykernel \
python313-ipython-genutils \
python313-nest-asyncio \
python313-notebook-shim"

inherit rpm
