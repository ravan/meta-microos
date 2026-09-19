SUMMARY = "German language files for bugzilla"
DESCRIPTION = "This package includes german language files for bugzilla"
LICENSE = "MPL-2.0"

PV = "5.2"

RPM_NAME = "bugzilla-lang-de-5.2-1.6.noarch.rpm"
RPM_HASH = "f3bb861a6a98e1c2a4109c87def32f0e5bd309180b01277920111ea82f4ae37f5ad6157b0126ef773838b00d034c0e222b7f341ad76e54cdad5e259a1aadf03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bugzilla-lang-de"

RDEPENDS:${PN} += "bugzilla \
user-wwwrun"

inherit rpm
