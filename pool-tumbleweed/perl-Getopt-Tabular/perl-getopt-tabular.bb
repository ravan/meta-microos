SUMMARY = "Table-driven argument parsing for Perl 5"
DESCRIPTION = "*Getopt::Tabular* is a Perl 5 module for table-driven argument parsing, \
vaguely inspired by John Ousterhout's Tk_ParseArgv. All you really need to \
do to use the package is set up a table describing all your command-line \
options, and call &GetOptions with three arguments: a reference to your \
option table, a reference to '@ARGV' (or something like it), and an \
optional third array reference (say, to '@newARGV'). &GetOptions will \
process all arguments in '@ARGV', and copy any leftover arguments (i.e. \
those that are not options or arguments to some option) to the '@newARGV' \
array. (If the '@newARGV' argument is not supplied, 'GetOptions' will \
replace '@ARGV' with the stripped-down argument list.) If there are any \
invalid options, 'GetOptions' will print an error message and return 0. \
 \
Before I tell you all about why Getopt::Tabular is a wonderful thing, let \
me explain some of the terminology that will keep popping up here."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.300.0"

RPM_NAME = "perl-Getopt-Tabular-0.300.0-1.9.noarch.rpm"
RPM_HASH = "ecddc880b5556eba3246c20f2b5dc83b1a68df71a91a385226427dee18ee416577ab441592bf9d6d85c55052a1fc6b5608bd82693a2271629196e5bbc29fa828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Getopt--Tabular \
perl-Getopt-Tabular"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
