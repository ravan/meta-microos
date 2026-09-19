SUMMARY = "Documentation for cinnamon-menus"
DESCRIPTION = "This package ships the HTML documentation for cinnamon-menus"
LICENSE = "LGPL-2.1-or-later"

PV = "6.6.0"

RPM_NAME = "cinnamon-menus-doc-6.6.0-1.4.noarch.rpm"
RPM_HASH = "bcd9fcc20c8bbfe7f5a7442180c7da431bc77327d03815bae4b8cd5f3d34bd9a53642093c1cc031406e73caabc14fb47e906314723ec91a79a9fe5fa00848a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-menus-doc"

RDEPENDS:${PN} += ""

inherit rpm
