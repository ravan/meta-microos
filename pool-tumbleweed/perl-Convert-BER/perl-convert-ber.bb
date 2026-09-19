SUMMARY = "ASN.1 Basic Encoding Rules"
DESCRIPTION = "Convert::BER is a Perl object class implementation for encoding and \
decoding objects as described by ITU-T standard X.209 (ASN.1) using \
Basic Encoding Rules (BER). \
 \
WARNING this module is no longer supported, See Convert::ASN1"
LICENSE = "GPL-2.0+"

PV = "1.32"

RPM_NAME = "perl-Convert-BER-1.32-27.46.aarch64.rpm"
RPM_HASH = "cb3d3058c02815a1f13ae18f9d2f0ed2e3582ee1290eae6027518b8de2ec15e2283a00446604c4219960e22935c00be165bd67d22999f04fe17f97a93417e016"

RPROVIDES:${PN} += "perl-Convert--BER \
perl-Convert--BER---Time-generic \
perl-Convert--BER--ANY \
perl-Convert--BER--BER \
perl-Convert--BER--BIT-STRING \
perl-Convert--BER--BIT-STRING8 \
perl-Convert--BER--BOOLEAN \
perl-Convert--BER--CHOICE \
perl-Convert--BER--CONSTRUCTED \
perl-Convert--BER--INTEGER \
perl-Convert--BER--NULL \
perl-Convert--BER--OBJECT-ID \
perl-Convert--BER--OPTIONAL \
perl-Convert--BER--REAL \
perl-Convert--BER--SEQUENCE \
perl-Convert--BER--SEQUENCE-OF \
perl-Convert--BER--STRING \
perl-Convert-BER \
perl-ber"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
