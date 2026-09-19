SUMMARY = "Multiple dispatch in Python"
DESCRIPTION = "A relatively sane approach to multiple dispatch in Python. \
 \
This implementation of multiple dispatch is mostly complete, \
performs static analysis to avoid conflicts, and provides optional namespace \
support."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python314-multipledispatch-1.0.0-2.5.noarch.rpm"
RPM_HASH = "29752cb377d9f250f8edf35b4b5859060bd7c364c0b605445d9215140ed14236814763fd4eb4932e4716c5500b0ea93ecc92b1a2799bdf1348a68050775f5abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-multipledispatch \
python314-multipledispatch \
python3dist-multipledispatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
