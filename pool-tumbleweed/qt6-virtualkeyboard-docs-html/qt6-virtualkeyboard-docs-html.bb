SUMMARY = "Documentation for qt6-virtualkeyboard in HTML format"
DESCRIPTION = "This package contains documentation for qt6-virtualkeyboard in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-virtualkeyboard-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3b958dceba16ab161eaab6d602ac2c8cc09a5fa0b87ee9dd2c06e415c487e0b581b70ca34bd1abff5f82e8b7b857e6d6da120440c8d45e3bfecc247931e6b4e7"

RPROVIDES:${PN} += "qt6-virtualkeyboard-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
