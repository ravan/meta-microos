SUMMARY = "An XS implementation of Mail::SPF"
DESCRIPTION = "This is an interface to the C library libspf2 for the purpose of \
testing. While it can be used as an SPF implementation, you can also \
use Mail::SPF, which is a little more perlish."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Mail-SPF_XS-0.01-8.13.aarch64.rpm"
RPM_HASH = "b30f97ac3558197f538addcda68ae274ac2b34791834f98d40a0b4f1d8bfe32683a244c24be0a875dcd76e8ababfd67e73858205b9311a81c818707066a2d0bd"

RPROVIDES:${PN} += "perl-Mail--SPF-XS \
perl-Mail-SPF-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
