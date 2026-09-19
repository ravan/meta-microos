SUMMARY = "Simplified Java Printing Support for SWT"
DESCRIPTION = "A simple, light weight, extensible Java printing plug-in for SWT."
LICENSE = "EPL-1.0"

PV = "1.0.4"

RPM_NAME = "paperclips-1.0.4-7.6.noarch.rpm"
RPM_HASH = "4344913ba8c2a7a373deeaffd2afef4597c8926c0a1e840c751e9eaa49bc3a6506e55ff02cf9c3bb9882fb9b3b50d2e1b7d396bc0cc1ff7dc0d40a3f9ec7aae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paperclips"

RDEPENDS:${PN} += ""

inherit rpm
