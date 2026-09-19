SUMMARY = "Internationalizing Domain Names in Applications (UTS #46)"
DESCRIPTION = "This module provides an easy-to-use interface for encoding and decoding \
Internationalized Domain Names (IDNs). \
 \
IDNs use characters drawn from a large repertoire (Unicode), but IDNA \
allows the non-ASCII characters to be represented using only the ASCII \
characters already allowed in so-called host names today \
(letter-digit-hyphen, '/[A-Z0-9-]/i'). \
 \
Use this module if you just want to convert domain names (or email \
addresses), using whatever IDNA standard is the best choice at the moment. \
 \
You should be familiar with Unicode support in perl, as this module expects \
correctly encoded input. See perlunitut, perluniintro and perlunicode for \
details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.502.0"

RPM_NAME = "perl-Net-IDN-Encode-2.502.0-1.1.aarch64.rpm"
RPM_HASH = "25859b62548b03e7a4edf49adf2045a26bd24914644c59f2868e5b4fc138bd14a60a23bc7e17f1226e165c6a48a0bc0d01188a3571b18bde790343b7622eacad"

RPROVIDES:${PN} += "perl-Net--IDN--Encode \
perl-Net--IDN--Punycode \
perl-Net--IDN--Punycode--PP \
perl-Net--IDN--UTS46 \
perl-Net-IDN-Encode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
