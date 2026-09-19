SUMMARY = "A thin, practical wrapper around terminal capabilities in Python"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python314-blessings-1.7-4.5.noarch.rpm"
RPM_HASH = "edfc1de65da5179a6f74393f319082d07de131e4df249546830c84dc7dd7a1350219230b48b909b46c45281c18f3ed5eba4826fe3cbe63b53df3806a8b2327c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-blessings \
python314-blessings \
python3dist-blessings"

RDEPENDS:${PN} += "python-abi \
python314-curses \
python314-six"

inherit rpm
