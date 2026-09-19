SUMMARY = "A pure-Python implementation of the HTTP/2 priority tree"
DESCRIPTION = "Priority is a pure-Python implementation of the priority logic for HTTP/2, set \
out in `RFC 7540 Section 5.3 (Stream Priority)`. This logic allows for clients \
to express a preference for how the server allocates its (limited) resources to \
the many outstanding HTTP requests that may be running over a single HTTP/2 \
connection."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-priority-2.0.0-3.5.noarch.rpm"
RPM_HASH = "a15367d1444a1836883013116be5ad008c93fe2109e5e123fbdc7a24d128ef1e549b6edf3e0ec150c65d50b55bbc1958c22f175f40ad9be33f9afa6da1a58b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-priority \
python3.13dist-priority \
python313-priority \
python3dist-priority"

RDEPENDS:${PN} += "python-abi"

inherit rpm
