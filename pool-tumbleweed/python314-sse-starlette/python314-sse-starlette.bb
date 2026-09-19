SUMMARY = "SSE plugin for Starlette"
DESCRIPTION = "SSE plugin for Starlette"
LICENSE = "BSD-3-Clause"

PV = "3.4.8"

RPM_NAME = "python314-sse-starlette-3.4.8-1.1.noarch.rpm"
RPM_HASH = "18d1714f338f0e53a0eea17dd595cd31c9cc322cc33d83cf22c72879ad09668f06119f0aabfd398ac91cc7fae6223a41a0c295d1bf70ee2ab5bfa6322a3fd7e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sse-starlette \
python314-sse-starlette \
python3dist-sse-starlette"

RDEPENDS:${PN} += "python-abi \
python314-anyio \
python314-starlette"

inherit rpm
