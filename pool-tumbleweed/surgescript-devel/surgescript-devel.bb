SUMMARY = "Files for developing applications using surgescript"
DESCRIPTION = "This package contains files required for \
developing applications using surgescript."
LICENSE = "Apache-2.0 & BSD-1-Clause & BSD-2-Clause & SUSE-Public-Domain"

PV = "0.6.1"

RPM_NAME = "surgescript-devel-0.6.1-2.6.aarch64.rpm"
RPM_HASH = "cbcfc0c537c8820b93d468503e876834f3482560f89b1de446bbdda0e0a618b9b1bb09ef49cca50dba43784f7a8eac5d47cdb18f89fe2f03053b08406862812c"

RPROVIDES:${PN} += "pkgconfig-surgescript \
surgescript-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsurgescript0-6-1"

inherit rpm
