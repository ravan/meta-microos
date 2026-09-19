SUMMARY = "Testsuite for systemd"
DESCRIPTION = "This package contains the unit tests as well as the extended testsuite. The unit \
tests are used to check various internal functions used by systemd whereas the \
extended testsuite is used to test various functionalities of systemd and all \
its components. \
 \
For now, you will also need to grab and install the most recent version of \
mkosi, available at https://github.com/systemd/mkosi.git. Indeed running the \
integration tests with meson + mkosi relies on the mkosi latest features. \
 \
Run the following python script to run all unit tests at once: \
$ /usr/lib/systemd/tests/run-unit-tests.py \
 \
To run the full extended testsuite do the following: \
$ cp -a /usr/lib/systemd/tests /var/tmp/systemd-testsuite \
$ cd /var/tmp/systemd-testsuite \
$ mkosi genkey \
$ mkosi summary \
$ mkosi -f \
$ mkosi -f box -- meson setup build integration-tests/standalone \
$ mkosi -f box -- meson test -C build --setup=integration --suite=integration-tests \
 \
Or to run one specific integration test: \
$ mkosi -f box -- meson test -C build --setup=integration --suite=integration-tests -v TEST-01-BASIC \
 \
Note that you need root privileges to run the extended testsuite. \
 \
For more details on the available options to run the extended testsuite, please \
refer to /usr/lib/systemd/tests/integration-tests/README.md."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-testsuite-261.2-1.2.aarch64.rpm"
RPM_HASH = "6be56e1d57fc994f33f4e775aceb5d838c484064e70cfcfcbc81f9506852fb9e1d196572d8bc00caabb9388cbb4b1b8d62e1152e8ddeb848f422fc6fbe0e2a6d"

RPROVIDES:${PN} += "systemd-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsystemd-core-261.2-1.2.so \
libsystemd-shared-261.2-1.2.so \
libsystemd.so.0 \
libudev.so.1"

inherit rpm
