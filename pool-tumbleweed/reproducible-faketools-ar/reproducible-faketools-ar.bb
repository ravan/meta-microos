SUMMARY = "replacement ar"
DESCRIPTION = "a script to enhance the reproducibility of the output of ar"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-ar-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "7b2e77de0fa87f9f38e4a62263a0850955a1fe4a36ab0cd69c88c79baa08ca59629e1ab82fa0f5ec39683301fe1af946ac3d4af945b74a465d3d9427f8bc1939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-ar"

RDEPENDS:${PN} += "/usr/bin/sh \
reproducible-faketools"

inherit rpm
