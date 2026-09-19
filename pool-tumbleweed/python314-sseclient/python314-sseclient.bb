SUMMARY = "Python client library for reading Server Sent Event streams"
DESCRIPTION = "This is a Python client library for iterating over http Server Sent Event (SSE) \
streams (also known as EventSource, after the name of the Javascript interface \
inside browsers). The SSEClient class accepts a url on init, and is then an \
iterator over messages coming from the server."
LICENSE = "MIT"

PV = "0.0.27"

RPM_NAME = "python314-sseclient-0.0.27-2.10.noarch.rpm"
RPM_HASH = "c727f7d3d73f663c4d3fda2516371a4382f92d5a4b1d8b542c00bbb89d794caf215a281fc40ccc3cdd073a26ccf12ef6c7913cda30a5e4c247e5f606b54c2155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sseclient \
python314-sseclient \
python3dist-sseclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python314-requests"

inherit rpm
