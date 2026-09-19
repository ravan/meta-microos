SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "Hunter is a flexible code tracing toolkit, not for measuring coverage, \
but for debugging, logging, inspection and other nefarious purposes."
LICENSE = "BSD-2-Clause"

PV = "3.9.0"

RPM_NAME = "python314-hunter-3.9.0-2.1.aarch64.rpm"
RPM_HASH = "db5f8bffc9a935c6efcf3dcd9e2a1c97101129b15e23459b1e1cc33b4050b3f85506758ea294a088e553cb9337c91cef04ae1225e48966cb75367b4ff95730c3"

RPROVIDES:${PN} += "python3.14dist-hunter \
python314-hunter \
python3dist-hunter"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
