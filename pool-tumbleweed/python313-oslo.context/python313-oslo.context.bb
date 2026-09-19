SUMMARY = "OpenStack Oslo context library"
DESCRIPTION = "The Oslo context library has helpers to maintain useful information \
about a request context. \
The request context is usually populated in the WSGI pipeline and \
used by various modules such as logging."
LICENSE = "Apache-2.0"

PV = "6.5.0"

RPM_NAME = "python313-oslo.context-6.5.0-1.1.noarch.rpm"
RPM_HASH = "2284e2fd0b5c47010d5f0fae4f57d69099e9afc1ae8059828b9b1a8949547bdcb4d89f44d64a4a9da31364af698dfee9c1d7cc175cb5e394efbc45f4f39b0fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.context \
python3.13dist-oslo.context \
python313-oslo.context \
python3dist-oslo.context"

RDEPENDS:${PN} += "python-abi \
python313-pbr \
python313-typing-extensions"

inherit rpm
