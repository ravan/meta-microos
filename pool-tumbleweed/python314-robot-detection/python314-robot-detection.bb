SUMMARY = "HTTP User Agent Bot Detection"
DESCRIPTION = "Library for detecting if a HTTP User Agent header is likely to be a bot."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "python314-robot-detection-0.4.0-5.5.noarch.rpm"
RPM_HASH = "29a9aac13d06737bedd92dc64581403d82d76aff2f2902d21ddf29b4f077a2f06949955362d3b8cd09e05ff5fe4e25e7372c3fdbf18058aa095e3608fd8f742f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-robot-detection \
python314-robot-detection \
python3dist-robot-detection"

RDEPENDS:${PN} += "python-abi"

inherit rpm
