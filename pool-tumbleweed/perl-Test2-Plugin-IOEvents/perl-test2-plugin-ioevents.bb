SUMMARY = "Turn STDOUT and STDERR into Test2 events"
DESCRIPTION = "This plugin turns prints to STDOUT and STDERR (including warnings) into \
proper Test2 events."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.1.1"

RPM_NAME = "perl-Test2-Plugin-IOEvents-0.1.1-1.7.noarch.rpm"
RPM_HASH = "4a8b557f45edb5db741e17522e3719bfd039ddf683e0607fe2fec82a71997dbd18b368dbfbac9ecc5d80d828e1d5af326ffbcbfeab8df3f002b04effdbe9a8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test2--Plugin--IOEvents \
perl-Test2--Plugin--IOEvents--Tie \
perl-Test2-Plugin-IOEvents"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test2--API"

inherit rpm
