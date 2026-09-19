SUMMARY = "replacement date"
DESCRIPTION = "a script to enhance the reproducibility of the output of date"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-date-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "0a8cf95b8e16457a48539f944be0215a2c6d393561859ef3e879d82ecb05ecaa04759de44bba1e13207c101acde01086513d44366b7e99361450703a641ee25c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-date"

RDEPENDS:${PN} += "/usr/bin/bash \
reproducible-faketools"

inherit rpm
