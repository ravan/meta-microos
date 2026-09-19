SUMMARY = "Documentation for wcslib library"
DESCRIPTION = "This package contains documentation and help files for wcslib library."
LICENSE = "LGPL-3.0-or-later"

PV = "8.6"

RPM_NAME = "wcslib-doc-8.6-1.3.noarch.rpm"
RPM_HASH = "b66d4f40e0f8697475274e8868c850ef45115ae89e4e85e93eafc9aa166468a05ac584b451f1e4cb2e3dad58b8284c97f6d0df471dc3a2c60fd4b48453af3cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libwcs-doc \
wcslib-doc"

RDEPENDS:${PN} += ""

inherit rpm
