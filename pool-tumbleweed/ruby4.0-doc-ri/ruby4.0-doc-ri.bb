SUMMARY = "Ruby Interactive Documentation"
DESCRIPTION = "This package contains the RI docs for ruby"
LICENSE = "BSD-2-Clause | Ruby"

PV = "4.0.6"

RPM_NAME = "ruby4.0-doc-ri-4.0.6-2.1.noarch.rpm"
RPM_HASH = "cf88524b4af48aa3633d8c1410409fd192b0e732b2f0c16f2f861459f0c2188396492b81fc9f8e5371027221a9cc1f3ebc86dee6568fd76181beac24c75e1b06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby4.0-doc-ri"

RDEPENDS:${PN} += "ruby4.0"

inherit rpm
