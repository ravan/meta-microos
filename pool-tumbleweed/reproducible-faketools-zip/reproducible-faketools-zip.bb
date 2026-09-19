SUMMARY = "replacement zip"
DESCRIPTION = "a script to enhance the reproducibility of the output of zip \
by replacing it with a wrapper to 7z"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-zip-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "0418a300ecde5d687f50f6f51090fceae54ba334904d3a5ebe35d8bdbe53d873462976b709d34a58854cfdd77ad88dd1ec3d706749fd0f294e5635fe7d1d3f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-zip"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
p7zip \
perl \
reproducible-faketools"

inherit rpm
