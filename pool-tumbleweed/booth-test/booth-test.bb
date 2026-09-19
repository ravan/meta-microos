SUMMARY = "Test scripts for Booth"
DESCRIPTION = "This package contains automated tests for Booth, \
the Cluster Ticket Manager for Pacemaker."
LICENSE = "GPL-2.0-or-later"

PV = "1.2+git0.322fea0"

RPM_NAME = "booth-test-1.2+git0.322fea0-1.13.aarch64.rpm"
RPM_HASH = "60d79c1c14423fa9ccb2abb2e39e2f2ccf22a9cc67226222b133dacd7874239506fb2cf09b06d9493b504ffce147aeee78d9c3133c179de0f72c98055ac07cd2"

RPROVIDES:${PN} += "booth-test"

RDEPENDS:${PN} += "/usr/bin/sh \
booth \
python3"

inherit rpm
