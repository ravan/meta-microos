SUMMARY = "WSGI request and response object"
DESCRIPTION = "WebOb provides wrappers around the WSGI request environment, and an \
object to help create WSGI responses. \
 \
The objects map much of the specified behavior of HTTP, including \
header parsing and accessors for other standard parts of the \
environment."
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python313-WebOb-1.8.10-1.3.noarch.rpm"
RPM_HASH = "cb3baf9d666c5f548ac2f291b26331d8532e3e647908a522b690ba5dd8ac4f11b13b25b336dfb1f180151978eef2b31d62b2cc830a0a8f60077ed0e93ea05c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WebOb \
python3.13dist-webob \
python313-WebOb \
python3dist-webob"

RDEPENDS:${PN} += "python-abi \
python313-legacy-cgi"

inherit rpm
