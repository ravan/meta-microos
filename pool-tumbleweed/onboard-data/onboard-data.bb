SUMMARY = "Simple On-screen Keyboard"
DESCRIPTION = "Language model files for the word suggestion feature of Onboard"
LICENSE = "GPL-3.0-only"

PV = "1.4.4.5"

RPM_NAME = "onboard-data-1.4.4.5-2.1.noarch.rpm"
RPM_HASH = "16de5bba679a32752516f6ee619abaf3ace2032187ba051ff30f6f578b48f264d82a6c2566ea69c7f790d582a837f6857522474fa7eed6e382827c1f34d9ba28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "onboard-data"

RDEPENDS:${PN} += "onboard"

inherit rpm
