SUMMARY = "Perl module for reading/writing/modifying complete files"
DESCRIPTION = "This module provides subs that allow you to read or write entire files with \
one simple call. They are designed to be simple to use, have flexible ways \
to pass in or get the file contents and to be very efficient. There is also \
a sub to read in all the files in a directory."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "9999.32"

RPM_NAME = "perl-File-Slurp-9999.32-1.29.noarch.rpm"
RPM_HASH = "8bb0224403643f435443b908e93f765ae12607bda8ec1a0ebb9ed9a3a6dac9048646683b0c68500d74bdb65294125a267152d035dbfc85e3a79fc0bc439f9544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurp \
perl-File-Slurp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
