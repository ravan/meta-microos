SUMMARY = "Test Scripts for oFono"
DESCRIPTION = "Scripts for testing oFono and its functionality."
LICENSE = "GPL-2.0-only"

PV = "2.19"

RPM_NAME = "ofono-tests-2.19-3.3.aarch64.rpm"
RPM_HASH = "a90ea42ea33a8da9caa4309465fac62cd006c36c8a6bd1b8fa3b4ff8495d0b8fd707479744034dead0550c06cedcf32cba952d5aafe46028fc240302cc628614"

RPROVIDES:${PN} += "ofono-test \
ofono-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
ofono"

inherit rpm
