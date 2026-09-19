SUMMARY = "perl module Crypt::SmbHash"
DESCRIPTION = "This module provides functions to generate LM/NT hashes as used by \
Samba"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.12"

RPM_NAME = "perl-Crypt-SmbHash-0.12-159.31.noarch.rpm"
RPM_HASH = "e224ee97296a3ab2567442a8b98d9c7fe1ee798b5f431abcf0daf219cce5a0e832084e9fdfb2f0da0ac96f125f1c3624a1155b7de4c5197b5150f635291843ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--SmbHash \
perl-Crypt-SmbHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Digest-MD4"

inherit rpm
