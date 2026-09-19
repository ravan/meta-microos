SUMMARY = "Test suite for davix"
DESCRIPTION = "The davix-tests package contains test executables that can be used \
to verify the functionality of the installed davix package. \
These are the same tests run during the package build (%check section)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.10"

RPM_NAME = "davix-tests-0.8.10-2.1.aarch64.rpm"
RPM_HASH = "508d12f44f49707a0ab94d2667153849446a53fe20dfa8b97dee339898f1bc0221ba38f7c617380f6058d553c1b8c2e8294ff3db1970673b56b6056100513bb9"

RPROVIDES:${PN} += "davix-tests"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdavix.so.0 \
libdavix0 \
libgcc-s.so.1 \
libgtest-main.so.1.17.0 \
libgtest.so.1.17.0 \
libstdc++.so.6"

inherit rpm
