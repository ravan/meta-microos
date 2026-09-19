SUMMARY = "A pure-Python implementation of the HTTP/2 priority tree"
DESCRIPTION = "Priority is a pure-Python implementation of the priority logic for HTTP/2, set \
out in `RFC 7540 Section 5.3 (Stream Priority)`. This logic allows for clients \
to express a preference for how the server allocates its (limited) resources to \
the many outstanding HTTP requests that may be running over a single HTTP/2 \
connection."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-priority-2.0.0-3.5.noarch.rpm"
RPM_HASH = "8169584ae2ba358e05c1df902624214d251806e553e86fe56f0c06748507ebd05aab7024689a79824b6041025db774d06e9a75e95658f74bc3c5ac62b7d78b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-priority \
python314-priority \
python3dist-priority"

RDEPENDS:${PN} += "python-abi"

inherit rpm
