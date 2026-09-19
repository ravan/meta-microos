SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "8.8.0"

RPM_NAME = "python313-jupyter-client-8.8.0-1.4.noarch.rpm"
RPM_HASH = "22b735a94489640a659f7cd3604e94be31cadf0e16b2bee445a78b07a1a8d93149fe448f909c57283a183ca1be70f8a81e1b4937704548e2fdc44e143c3cb17c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
python3-jupyter-client \
python3.13dist-jupyter-client \
python313-jupyter-client \
python3dist-jupyter-client"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-jupyter-core \
python313-python-dateutil \
python313-pyzmq \
python313-tornado \
python313-traitlets \
update-alternatives"

inherit rpm
