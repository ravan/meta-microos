SUMMARY = "Run build in the future"
DESCRIPTION = "Uses post script to modify the build system date, \
so that it works when rpmbuild runs as non-root (default). \
Needs osc build --clean \
Warning: Only install in scratch-VMs as it will change the system clock."
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-futurepost-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "8352a9c17cca6be5924b8f546b705b46ee43f70ccac96938ac1030a3a82b8f24948b8902422d9f83c3022dfd3b5135f5304e897fad46d501c9d1f668f68e7ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-futurepost"

RDEPENDS:${PN} += "/usr/bin/sh \
reproducible-faketools"

inherit rpm
