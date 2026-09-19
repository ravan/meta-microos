SUMMARY = "GrandOrgue demo sampleset"
DESCRIPTION = "This package contains the demo sampleset for GrandOrgue."
LICENSE = "GPL-2.0-or-later"

PV = "3.17.1"

RPM_NAME = "grandorgue-demo-3.17.1-1.3.noarch.rpm"
RPM_HASH = "3c1b32f4e2c15eb6c6b5e84cad888c00611bc5515f932aff228a833b7b4ae5202863f42548b3c984b03d37ed821a682b3aa467286a57ad20aaed022be10e4779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grandorgue-demo"

RDEPENDS:${PN} += ""

inherit rpm
