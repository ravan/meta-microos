SUMMARY = "Monospace font similar to Courier"
DESCRIPTION = "Courier Prime is a Courier-like monospace fonts for screenplay (and other use cases). \
It is optimized for 12 point size and matches the metrics of Courier."
LICENSE = "OFL-1.1"

PV = "1.203"

RPM_NAME = "courier-prime-fonts-1.203-2.22.noarch.rpm"
RPM_HASH = "bc5a535115d6ef9cc657352b52d19172caa428cc78bb0d0e3961ef44f91f1d6b0583b784d23c1aaedd88c3229f3668e23de8ea4a689d4d1aec52b8a6b24d9ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "courier-prime-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
