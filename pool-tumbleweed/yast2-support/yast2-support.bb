SUMMARY = "YaST2 - Support Inquiries"
DESCRIPTION = "This module allows you to collect system information for installation \
support in a standardized format."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-support-5.0.1-1.2.noarch.rpm"
RPM_HASH = "10b424104a73616b844a33c9d18badebadadf12c377b4ba25cedc2ceaf9fbf7eea43aadc6af3d24d9d5238924a413bd080d1fff7bf5e05cee659d0c76bb1c7ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-support"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
