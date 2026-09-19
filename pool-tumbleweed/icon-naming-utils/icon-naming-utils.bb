SUMMARY = "Icon Name Specification Mapping Script"
DESCRIPTION = "A script for creating a symlink mapping for deprecated icon names to \
the new icon naming specification names for desktop icon themes."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.90"

RPM_NAME = "icon-naming-utils-0.8.90-24.4.noarch.rpm"
RPM_HASH = "e982dab127fe92d6ca40a1f56210c99d55414fe031373a81cfe8d8c5f176aacd7fa7cba13f88471019b21ff4b81b2cc3640b8a06ce01742cb69aac274690c535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icon-naming-utils \
icon-naming-utils-devel \
pkgconfig-icon-naming-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
perl-XML-Simple"

inherit rpm
