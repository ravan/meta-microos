SUMMARY = "A Perl module to deal with time periods."
DESCRIPTION = "The *inPeriod* function determines if a given time falls within a given \
period. *inPeriod* returns *1* if the time does fall within the given \
period, *0* if not, and *-1* if *inPeriod* detects a malformed time or \
period."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.25"

RPM_NAME = "perl-Time-Period-1.25-1.42.noarch.rpm"
RPM_HASH = "3bfdf4e2311ad5065c8c434007cac86a85c1ad904cac659655a23b15f2eb02e07b0ea218ed3e79a039b4228ba4ba169df7d61bdf2268f5e6e6f6c4a9ac76f69d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Period \
perl-Time-Period"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
