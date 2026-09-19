SUMMARY = "Central daemon of KDE workspaces: Build Environment"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kded-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "ef933aa65c2cdfd269fb98eb298e1b65577ecedb972b2ec99fee766bf268acd9b44ab7da99060461f4dd8e2550b8113cbcdc89d1801a69e9d676a0bde30b66d9"

RPROVIDES:${PN} += "cmake-KDED \
kded-devel"

RDEPENDS:${PN} += "kded"

inherit rpm
