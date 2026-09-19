SUMMARY = "Files for Developing with mythes"
DESCRIPTION = "MyThes is a simple thesaurus that uses a structured text data file and an \
index file with binary search to look up words and phrases and return \
information on part of speech, meanings, and synonyms. \
 \
This package contains the mythes development files."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.2.5"

RPM_NAME = "mythes-devel-1.2.5-1.12.aarch64.rpm"
RPM_HASH = "3a29728b29699389572d338165dd27b6456dc38f4dd1340e98cedd4d0de1ed1805597f5d6aec2a8e763a9b1d9a442769b0e2df55e1b652a96d1ec77e5a57ef3b"

RPROVIDES:${PN} += "mythes-devel \
pkgconfig-mythes"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
libmythes-1-2-0"

inherit rpm
