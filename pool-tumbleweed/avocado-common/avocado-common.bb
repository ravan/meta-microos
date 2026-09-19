SUMMARY = "Avocado Test Framework"
DESCRIPTION = "Avocado is a set of tools and libraries (what people call these days a \
framework) to perform automated testing. \
 \
This package contains common infrastructure files."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "avocado-common-113.0-1.2.noarch.rpm"
RPM_HASH = "206031697f0d9f8ad529e0c39b369ed5b1790a64e1ab4007a1502303b0b5dcf34ed2cf756a2edcb7dd6eeaae835742945ef767ba15e810fb738d70d10db42726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avocado-common \
config-avocado-common"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
