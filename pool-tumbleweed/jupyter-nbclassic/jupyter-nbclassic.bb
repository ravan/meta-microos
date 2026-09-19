SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend. \
 \
This package contains the jupyterlab server configuration and desktop files"
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "jupyter-nbclassic-1.3.3-2.2.noarch.rpm"
RPM_HASH = "092d9794a0ed82d0390819f8d96a0d15d980cbffdec0bbf1ae678375ab66a5db2e97e9dbb3729161082b6d1551612bfaf55f85d636c580b58888321e1dcbb312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbclassic"

RDEPENDS:${PN} += "python3dist-nbclassic"

inherit rpm
