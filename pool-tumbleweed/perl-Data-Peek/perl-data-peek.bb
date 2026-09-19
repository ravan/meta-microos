SUMMARY = "Modified and extended debugging facilities"
DESCRIPTION = "Data::Peek started off as 'DDumper' being a wrapper module over \
Data::Dumper, but grew out to be a set of low-level data introspection \
utilities that no other module provided yet, using the lowest level of the \
perl internals API as possible."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.540.0"

RPM_NAME = "perl-Data-Peek-0.540.0-1.6.aarch64.rpm"
RPM_HASH = "425f181bc8e04252fca583c75a79b43a505dfccca586f571283c36b5bd208b0515e49f8571cb1a89ee13265a844d32086e414823c8f28bb6a29f6dda1045a546"

RPROVIDES:${PN} += "perl-Data--Peek \
perl-Data-Peek"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Test--More \
perl-Test--Warnings"

inherit rpm
