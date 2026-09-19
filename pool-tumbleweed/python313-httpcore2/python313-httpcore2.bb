SUMMARY = "A minimal low-level HTTP client"
DESCRIPTION = "The HTTP Core package provides a minimal low-level HTTP client, which does \
one thing only. Sending HTTP requests."
LICENSE = "BSD-3-Clause"

PV = "2.12.0"

RPM_NAME = "python313-httpcore2-2.12.0-1.1.noarch.rpm"
RPM_HASH = "475f115adf1edf0f7133816b791d7b6c36e4fa0cc8388304860ae63b3a6b916c1d9593cf09cb3df7be200a499e73432ed60929e0e81b8c7c4a417000a5cc8b26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpcore2 \
python3.13dist-httpcore2 \
python313-httpcore2 \
python3dist-httpcore2"

RDEPENDS:${PN} += "python-abi \
python313-h11 \
python313-truststore"

inherit rpm
