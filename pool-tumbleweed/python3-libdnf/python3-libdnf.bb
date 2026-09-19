SUMMARY = "Python 3 bindings for the libdnf library"
DESCRIPTION = "This package provides the Python 3 bindings for the libdnf library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.75.0"

RPM_NAME = "python3-libdnf-0.75.0-1.3.aarch64.rpm"
RPM_HASH = "9dd6ec28385e48e233591419ce5bc95ca04ecf894f22348ae20b1c8789af79f490489d3edd5135c145c080496951ee1d8e0f5b49814082c1a82589d141a1b4a7"

RPROVIDES:${PN} += "python3-libdnf \
python3.13dist-libdnf \
python3dist-libdnf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf.so.2 \
libdnf2 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libsmartcols.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
