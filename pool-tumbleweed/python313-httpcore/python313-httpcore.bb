SUMMARY = "Minimal low-level Python HTTP client"
DESCRIPTION = "Python minimal low-level HTTP client."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python313-httpcore-1.0.9-1.6.noarch.rpm"
RPM_HASH = "f54f293563fcc54904e1238896934d801351c185086f29a4ca3c02f58b11d44618ea13a4710c4c6f66be28e441f5aa0607b2b651d22ebad056bbaa8c5dfb3727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpcore \
python3.13dist-httpcore \
python313-httpcore \
python3dist-httpcore"

RDEPENDS:${PN} += "-python313-anyio >= 3 with python313-anyio < 5 \
-python313-sniffio >= 1.0 with python313-sniffio < 2 \
python-abi \
python313-certifi \
python313-h11"

inherit rpm
