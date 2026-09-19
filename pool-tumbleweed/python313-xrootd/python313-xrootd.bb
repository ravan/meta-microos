SUMMARY = "Python bindings for xrootd"
DESCRIPTION = "This package provides python3 bindings for xrootd."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "python313-xrootd-5.9.0-1.5.aarch64.rpm"
RPM_HASH = "9c938e6abd7809a1b2aade249db6becebe37e641975b1f694054448544e03264ab0f67f13dab1df9a5b76764953be5e8bfc0f2439721b2836e7e7ed023b3581f"

RPROVIDES:${PN} += "python3-xrootd \
python3.13dist-xrootd \
python313-xrootd \
python3dist-xrootd"

RDEPENDS:${PN} += "libXrdCl.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
