SUMMARY = "replacement hostname"
DESCRIPTION = "a script to enhance the reproducibility of the output of hostname"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-hostname-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "496b2bb07f36eb7f966923e4bf12df41fe896c780c12e8ee0851fd9f9c637aebd2285dfec1cd3e2a41f8fde2322990c6e7d93d4b6ba45f5cacd0b0bee827c9cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-hostname"

RDEPENDS:${PN} += "/usr/bin/sh \
hostname \
reproducible-faketools"

inherit rpm
