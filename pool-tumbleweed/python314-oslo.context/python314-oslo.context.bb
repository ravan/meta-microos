SUMMARY = "OpenStack Oslo context library"
DESCRIPTION = "The Oslo context library has helpers to maintain useful information \
about a request context. \
The request context is usually populated in the WSGI pipeline and \
used by various modules such as logging."
LICENSE = "Apache-2.0"

PV = "6.5.0"

RPM_NAME = "python314-oslo.context-6.5.0-1.1.noarch.rpm"
RPM_HASH = "f40c67b2192c2e99b9c2a8cec014f0e5bd6a760177a81dc4db73fd694736f45bd15153941622c74df0d5c53e0dbb9ed0825ac98c2c4f15bbb9c0726aa1aed957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.context \
python314-oslo.context \
python3dist-oslo.context"

RDEPENDS:${PN} += "python-abi \
python314-pbr \
python314-typing-extensions"

inherit rpm
