SUMMARY = "Scripts to Work with Spreadsheets"
DESCRIPTION = "This package includes some scripts to work with spreadsheets."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.950.0"

RPM_NAME = "perl-Spreadsheet-Read-scripts-0.950.0-1.5.noarch.rpm"
RPM_HASH = "a9a17a13c55af5ed16d83794581379d9f6235adf2778e1efe5965a228d563e2087df4c58ea23257b8d2bb6429fe516a2547c7965efa04d77414c4bf11503b620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet-Read-scripts"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-HTML--Entities \
perl-Spreadsheet--Read \
perl-Term--ReadKey \
perl-Text--CSV-XS \
perl-Tk \
perl-Tk--TableMatrix--Spreadsheet"

inherit rpm
