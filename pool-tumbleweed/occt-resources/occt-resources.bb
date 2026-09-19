SUMMARY = "Binary resource files for occt"
DESCRIPTION = "This package contains resource files imported from the libraries."
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.9.3"

RPM_NAME = "occt-resources-7.9.3-1.4.noarch.rpm"
RPM_HASH = "4f887e8a4ed06f5b17333491505685bce34c4d3035953fae39062f37703cb08a937eea1c312bf2eb09a6e664bced104d134714b0813b9ac38207ce8a06f6df41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "occt-resources"

RDEPENDS:${PN} += ""

inherit rpm
