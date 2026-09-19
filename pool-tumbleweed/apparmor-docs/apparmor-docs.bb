SUMMARY = "AppArmor Documentation package"
DESCRIPTION = "This package contains documentation for AppArmor. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2"

RPM_NAME = "apparmor-docs-5.0.2-2.1.noarch.rpm"
RPM_HASH = "b4cc2f7a530a5a0417f078af8155e8c0fe7b90770e535d4cc65992f163496348c1a59486107bfbd38061e63e09fc34af6ad86df717b7e03c42c26d958b1287d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-docs"

RDEPENDS:${PN} += ""

inherit rpm
