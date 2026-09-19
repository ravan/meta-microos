SUMMARY = "Simple configuration file class"
DESCRIPTION = "Reading and writing configuration files is one of the most frequent tasks of \
any software design. Config::Simple is the library that helps you with it. \
 \
Config::Simple is a class representing configuration file object. It supports \
several configuration file syntax and tries to identify the file syntax \
automatically. Library supports parsing, updating and creating configuration \
files."
LICENSE = "Artistic-1.0"

PV = "4.59"

RPM_NAME = "perl-Config-Simple-4.59-19.46.aarch64.rpm"
RPM_HASH = "e88223f1a4124c7adfbb1899fe7a22dd0d5a7e664c92bdf3e737d648a673290cd8e8dcc68d5d127456282cd10e0e6f5a1ff0e826beec4ab125a5f2155d768a83"

RPROVIDES:${PN} += "perl-Config--Simple \
perl-Config-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-AutoLoader"

inherit rpm
