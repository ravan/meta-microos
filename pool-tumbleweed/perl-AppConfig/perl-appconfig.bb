SUMMARY = "AppConfig is a bundle of Perl5 modules for reading configuration files a[cut]"
DESCRIPTION = "AppConfig is a Perl5 module for managing application configuration \
information. It maintains the state of any number of variables and provides \
methods for parsing configuration files, command line arguments and CGI \
script parameters. \
 \
Variables values may be set via configuration files. Variables may be flags \
(On/Off), take a single value, or take multiple values stored as a list or \
hash. The number of arguments a variable expects is determined by its \
configuration when defined."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.710.0"

RPM_NAME = "perl-AppConfig-1.710.0-1.7.noarch.rpm"
RPM_HASH = "15482dbc160edd8743f512c1a8eb5c7879461ab16f2d656e8a59e5342fb9c1905ff93b1b9fa3dbee5d68d60324f5fb799cdbe9a11e3feae66876d80dfa84abab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AppConfig \
perl-AppConfig--Args \
perl-AppConfig--CGI \
perl-AppConfig--File \
perl-AppConfig--Getopt \
perl-AppConfig--State \
perl-AppConfig--Sys"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
