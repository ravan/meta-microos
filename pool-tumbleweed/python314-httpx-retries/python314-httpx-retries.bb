SUMMARY = "A retry layer for HTTPX"
DESCRIPTION = "A retry layer for the HTTPX client: configurable retry behaviour with \
exponential backoff for transient HTTP errors."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-httpx-retries-0.6.0-1.2.noarch.rpm"
RPM_HASH = "7c2618428f3029a3e620a82b8f2b841a28c8ae91828ed022a1c6b8dd8a18f77abe3373197d851207e1e1a6a90c0a832607a26c5d4b14f2783c0af16cb033d86f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpx-retries \
python314-httpx-retries \
python3dist-httpx-retries"

RDEPENDS:${PN} += "python-abi \
python314-httpx"

inherit rpm
