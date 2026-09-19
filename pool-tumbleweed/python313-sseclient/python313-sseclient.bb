SUMMARY = "Python client library for reading Server Sent Event streams"
DESCRIPTION = "This is a Python client library for iterating over http Server Sent Event (SSE) \
streams (also known as EventSource, after the name of the Javascript interface \
inside browsers). The SSEClient class accepts a url on init, and is then an \
iterator over messages coming from the server."
LICENSE = "MIT"

PV = "0.0.27"

RPM_NAME = "python313-sseclient-0.0.27-2.10.noarch.rpm"
RPM_HASH = "8c1d6780b338346fcf939393da3ef23679de7d4668a290c33adc73c5b2ea8a97c3dae64f077b158ed6d8af6babb38a9a393ab89a7b30e81c86acbf9c878dafe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sseclient \
python3.13dist-sseclient \
python313-sseclient \
python3dist-sseclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python313-requests"

inherit rpm
