SUMMARY = "Consume Server-Sent Event (SSE) messages with HTTPX"
DESCRIPTION = "Consume Server-Sent Event (SSE) messages with HTTPX."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python314-httpx-sse-0.4.3-1.2.noarch.rpm"
RPM_HASH = "82a1b871dacf6280e2f38580165934c9775639164873252e7fedc3be6769fe2da5db498da9fa01f27e8e033f6a03293fcbfb4bae26ee93c13e475c7faefc42b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpx-sse \
python314-httpx-sse \
python3dist-httpx-sse"

RDEPENDS:${PN} += "python-abi \
python314-httpx"

inherit rpm
