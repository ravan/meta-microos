SUMMARY = "Documentation for Lmod"
DESCRIPTION = "Documentation (pdf) for the Lmod Environment Modules System."
LICENSE = "MIT"

PV = "8.7.55"

RPM_NAME = "lua-lmod-doc-8.7.55-4.4.noarch.rpm"
RPM_HASH = "27fe0a0d7ecc50a7d84a94e43ae74326a4a27c27399afd6168531267508c4076f21423ae4198c4dc9bf2d503b7f2469c7305ad3e797dcec64c8d88d4ac799e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-lmod-doc"

RDEPENDS:${PN} += ""

inherit rpm
