SUMMARY = "the fastest way to sort anything in Perl"
DESCRIPTION = "Sort::Key provides a set of functions to sort lists of values by some \
calculated key value. \
 \
It is faster (usually *much faster*) and uses less memory than other \
alternatives implemented around perl sort function (ST, GRT, etc.). \
 \
Multi-key sorting functionality is also provided via the companion modules \
the Sort::Key::Multi manpage, the Sort::Key::Maker manpage and the \
Sort::Key::Register manpage."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.33"

RPM_NAME = "perl-Sort-Key-1.33-1.51.aarch64.rpm"
RPM_HASH = "10993d752ab57eeef9df34a872a4b84f3064be23842f071d7eb7ead75efe3341f9131acd2b36952160cf5ef027545f506c0fa2e493746fbb2fbf6bc60b9c0fb4"

RPROVIDES:${PN} += "perl-Sort--Key \
perl-Sort--Key--Maker \
perl-Sort--Key--Multi \
perl-Sort--Key--Natural \
perl-Sort--Key--Register \
perl-Sort--Key--Types \
perl-Sort-Key"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
