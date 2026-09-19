SUMMARY = "Development headers for tolua"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.4"

RPM_NAME = "libtolua-devel-5.2.4-5.9.aarch64.rpm"
RPM_HASH = "de2a3a81e60f86eb353c9acde2023d8371bb2d3b95f4dcf8d72a5e8015f120dc280a4063978b7d48f8fbca40be40eb569249bb59748502286c928ee2a44ec9dc"

RPROVIDES:${PN} += "libtolua-devel \
tolua-devel"

RDEPENDS:${PN} += "tolua"

inherit rpm
