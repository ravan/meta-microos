SUMMARY = "Javadocs for jhighlight"
DESCRIPTION = "This package contains the API documentation for jhighlight."
LICENSE = "CDDL-1.0 | LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "jhighlight-javadoc-1.0.1-3.8.noarch.rpm"
RPM_HASH = "3761cbc0c58df24b385e4951d57006ebd9af7a8f8c5b2b0e484b9313551777fe6d13e8e03c8527e34ff1771b9bcb860481c0d5d36e33370515bbb1407dc0ffe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jhighlight-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
