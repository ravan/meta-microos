SUMMARY = "Simplified essay input schema for rime"
DESCRIPTION = "simplified essay input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-essay-simp-20250315-1.4.noarch.rpm"
RPM_HASH = "256c5c9a8f0cb0b2007a3790d960e5287721140995cc5f36759f5fad20d670c68da936b2d89f0d454e96040ab3238ef3ea33eb81810234250345f18d6708ce21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-essay-simp"

RDEPENDS:${PN} += ""

inherit rpm
