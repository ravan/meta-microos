SUMMARY = "Perl Module to decode Strings with XML Entities"
DESCRIPTION = "This module deals with decoding of strings with XML character entities."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.0002"

RPM_NAME = "perl-XML-Entities-1.0002-3.7.aarch64.rpm"
RPM_HASH = "bd1adfabdccfffb01d73c6b1cda62be17eb892ecf2704e225732f42fdb20873da434c88a4a55a351530421349908ff842e6b4bd3ee24ab4b97a17430532d5b44"

RPROVIDES:${PN} += "perl-XML--Entities \
perl-XML--Entities--Data \
perl-XML-Entities"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
