SUMMARY = "Abstraction over xpyb"
DESCRIPTION = "xpybutil is an abstraction over the X Python Binding (xpyb). It exists because xpyb is a very low level library that communicates with X."
LICENSE = "WTFPL"

PV = "0.0.6"

RPM_NAME = "python313-xpybutil-0.0.6-3.5.noarch.rpm"
RPM_HASH = "c9ca581da2c248a36bc8d754dd5d483f3223c559df5b9a789ad1382bd3b47abd5bc2db110023e355a2679f6263a74c8da774da2fe8871a76f447493a1734b5ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xpybutil \
python3.13dist-xpybutil \
python313-xpybutil \
python3dist-xpybutil"

RDEPENDS:${PN} += "python-abi \
python313-xcffib"

inherit rpm
