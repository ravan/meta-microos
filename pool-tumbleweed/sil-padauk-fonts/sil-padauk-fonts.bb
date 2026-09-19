SUMMARY = "A font that supports the many diverse languages that use the Myanmar script"
DESCRIPTION = "Padauk is a Unicode Myanmar font family with broad support for \
writing systems that use the Myanmar script. This script is an \
abugida, a writing system in which each consonant has an inherent \
vowel."
LICENSE = "OFL-1.1"

PV = "6.000"

RPM_NAME = "sil-padauk-fonts-6.000-1.3.noarch.rpm"
RPM_HASH = "70bbec1b4afbb780a9f9816843390b9b51ca934d39f53806fd726b353896582d729263ff0fecd5ec2c5223fb7f4466f5b74e53392de015da74b3635b4735908b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-my \
sil-padauk \
sil-padauk-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
