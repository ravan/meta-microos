SUMMARY = "Development files for perl-Tk"
DESCRIPTION = "Development files for Tk - a graphical user interface toolkit for Perl"
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Zlib"

PV = "804.36.0"

RPM_NAME = "perl-Tk-devel-804.36.0-1.10.aarch64.rpm"
RPM_HASH = "e6b66f614701e24469559952d137f00e840aae91f06f871801cdb86ab1d31d4850da980988b108fbb11a1de21ac143083e0d77a19912c5cbf202f74df02b96da"

RPROVIDES:${PN} += "perl-Tk-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Tk"

inherit rpm
