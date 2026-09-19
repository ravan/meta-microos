SUMMARY = "Date Object, with As Little Code As Possible"
DESCRIPTION = "*Date::Tiny* is a member of the DateTime::Tiny suite of time modules. \
 \
It implements an extremely lightweight object that represents a date, \
without any time data."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Date-Tiny-1.07-1.39.noarch.rpm"
RPM_HASH = "a82e357c1d5aa9fc90de281b59ebe00c920a137aec678a8c099124a22ac9b6acf32358c3401fc8966c171024bae838db8345ba2b5f26992ea84cf1a98b959334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Tiny \
perl-Date-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
