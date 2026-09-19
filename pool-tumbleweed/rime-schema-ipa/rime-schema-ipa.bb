SUMMARY = "Rime schema to input IPA"
DESCRIPTION = "ipa input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-ipa-20250315-1.4.noarch.rpm"
RPM_HASH = "b06b597ff03e03da0cca595fa5f6234d03b96114ca6d6fb02583829d1579849bb4f620181c18184c5480588b9ce13dfada3323b9d92164ff1c0f3e32d732e6c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-ipa"

RDEPENDS:${PN} += ""

inherit rpm
