SUMMARY = "Documentation for qt6-base in HTML format"
DESCRIPTION = "This package contains documentation for qt6-base in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-base-docs-html-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "d268515e484f11abad839e17d8360f91432829e8db667d5541faa0c8151dc37189f46be070ecb60ef92834f5e94a05e05f80b9a741acbb5cdb5fab123427b2f0"

RPROVIDES:${PN} += "qt6-base-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
