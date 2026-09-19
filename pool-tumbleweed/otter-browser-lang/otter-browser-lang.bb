SUMMARY = "Translations for package otter-browser"
DESCRIPTION = "Provides translations for the 'otter-browser' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.03"

RPM_NAME = "otter-browser-lang-1.0.03-1.17.noarch.rpm"
RPM_HASH = "3fc6cd3292fb9d3d0b3e0689fe6ade74021b2ec71b7c6f597f54efd48e53f2001555224f99fb8bc776cc4bc3687fd8aff88568a8ec11a3b93e1f2b91af94c6ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "otter-browser-lang \
otter-browser-lang-all"

RDEPENDS:${PN} += "otter-browser"

inherit rpm
