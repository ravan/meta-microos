SUMMARY = "Convert between perl data structures and ASN.1 encoded packets"
DESCRIPTION = "Convert::ASN1 encodes and decodes ASN.1 data structures using BER/DER \
rules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.340.0"

RPM_NAME = "perl-Convert-ASN1-0.340.0-2.12.noarch.rpm"
RPM_HASH = "009efc7ab02dce74fbd00196e038f1c92591b49c401632d3d5f4a60a14fb6b5dce9286c191c910f59e3f1a673bc85d8b536f730d13419d18e6ca20b4fa074ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Convert--ASN1 \
perl-Convert--ASN1--parser \
perl-Convert-ASN1"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
