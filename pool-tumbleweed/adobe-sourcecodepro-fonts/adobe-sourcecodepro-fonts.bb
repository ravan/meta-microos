SUMMARY = "A set of OpenType fonts designed for coding environments"
DESCRIPTION = "Source Code is a set of monospaced OpenType fonts that have been designed to \
work well with coding environments. This family of fonts is a complementary \
design to the Source Sans family."
LICENSE = "OFL-1.1"

PV = "2.038"

RPM_NAME = "adobe-sourcecodepro-fonts-2.038-1.12.noarch.rpm"
RPM_HASH = "39316a766b0ea23b24d87eb8f7e8fdb5f7111d1631b602988f92a7d1a10827aded40740ad4b2f10f10f6fde917b611b7005159e2101004db7d218f3324cc6caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "SourceCodePro-fonts \
adobe-sourcecodepro-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
