SUMMARY = "Abstraction over xpyb"
DESCRIPTION = "xpybutil is an abstraction over the X Python Binding (xpyb). It exists because xpyb is a very low level library that communicates with X."
LICENSE = "WTFPL"

PV = "0.0.6"

RPM_NAME = "python314-xpybutil-0.0.6-3.5.noarch.rpm"
RPM_HASH = "b55ecb3dbbd3b1833e1699e11c15dfcb03a8567fe3eb4698ff655a72a8652e5baed7f3c332536c6a276890ed6bd436025f7f707af78b96c6112818a42f6c2a7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xpybutil \
python314-xpybutil \
python3dist-xpybutil"

RDEPENDS:${PN} += "python-abi \
python314-xcffib"

inherit rpm
