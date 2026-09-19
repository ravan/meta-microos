SUMMARY = "WSGI request and response object"
DESCRIPTION = "WebOb provides wrappers around the WSGI request environment, and an \
object to help create WSGI responses. \
 \
The objects map much of the specified behavior of HTTP, including \
header parsing and accessors for other standard parts of the \
environment."
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python314-WebOb-1.8.10-1.3.noarch.rpm"
RPM_HASH = "6c1e9dda8551f0f652d976ff4c1e821bca3b32f3cd29bd53a4a471c8a82bf656dfb3fd428406d1555317e1e8cc3929e22a805d4527b0b3d1151d4109d062c48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-webob \
python314-WebOb \
python3dist-webob"

RDEPENDS:${PN} += "python-abi \
python314-legacy-cgi"

inherit rpm
