SUMMARY = "Consume Server-Sent Event (SSE) messages with HTTPX"
DESCRIPTION = "Consume Server-Sent Event (SSE) messages with HTTPX."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python313-httpx-sse-0.4.3-1.2.noarch.rpm"
RPM_HASH = "81b089eb4cf1e4c3ce7258d6dd7c56ff5e956cd7a2732eaa90a2b05a6ad118dd6a8ddffff62d45675aa38807852178534b1e5bc88a95a3364a71d4cd21b0e8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpx-sse \
python3.13dist-httpx-sse \
python313-httpx-sse \
python3dist-httpx-sse"

RDEPENDS:${PN} += "python-abi \
python313-httpx"

inherit rpm
