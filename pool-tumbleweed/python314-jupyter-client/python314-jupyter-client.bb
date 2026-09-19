SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "8.8.0"

RPM_NAME = "python314-jupyter-client-8.8.0-1.4.noarch.rpm"
RPM_HASH = "e2a2cf50904973c47312339a1401d7f7b0a5556aec0f4cf97dc5fb607bce86e5d2612a490ed89a47daff9aaace62bea52f056aa5f546fa6aaf7a18efa5e53589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
python3.14dist-jupyter-client \
python314-jupyter-client \
python3dist-jupyter-client"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-jupyter-core \
python314-python-dateutil \
python314-pyzmq \
python314-tornado \
python314-traitlets \
update-alternatives"

inherit rpm
