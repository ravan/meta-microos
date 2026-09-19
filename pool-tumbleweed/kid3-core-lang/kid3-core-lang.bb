SUMMARY = "Translations for package kid3-core"
DESCRIPTION = "Provides translations for the 'kid3-core' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.7"

RPM_NAME = "kid3-core-lang-3.9.7-2.6.noarch.rpm"
RPM_HASH = "ca9a371186ed8601d8f9c991f6c13a8ef52ab9d43c8b7e297727a6efc17f40291981b7703a858262c5615caa604bb61cb2a6f25aebe9e5271db2fd325ad6f24e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kid3-core-lang \
kid3-core-lang-all"

RDEPENDS:${PN} += "kid3-core"

inherit rpm
