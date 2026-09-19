SUMMARY = "API documentation for the libspf2 library"
DESCRIPTION = "The libspf2-apidocs package contains the API documentation for creating \
applications that use the libspf2 (Sender Policy Framework) library."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-apidocs-1.2.11-8.13.noarch.rpm"
RPM_HASH = "f9c6d252149c0f256f5a39974e937efced1ff55ad1b18a6f092a4494176d07c8bd535840da7f839de102b76cfd8230678cf1c0dabe7d23f434bd9663206802a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libspf2-apidocs"

RDEPENDS:${PN} += ""

inherit rpm
