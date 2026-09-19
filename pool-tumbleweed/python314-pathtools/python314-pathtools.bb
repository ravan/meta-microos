SUMMARY = "File system general utilities"
DESCRIPTION = "Pattern matching and various utilities for file systems paths."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-pathtools-0.1.2-16.12.noarch.rpm"
RPM_HASH = "d8d43a72c4a17799294f86a328349c1629d4d627606e74007da6b67cdb0461c3a7b8b2682360d51a81acff38b140195259bb59aa0d59dbb669b79599b6838f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pathtools \
python314-pathtools \
python3dist-pathtools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
