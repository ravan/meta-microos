SUMMARY = "Read and write MySQL-style configuration files"
DESCRIPTION = "This module extends Config::INI to support reading and writing MySQL-style \
configuration files. Although deceptively similar to standard '.INI' files, \
they can include bare boolean options with no value assignment and \
additional features like '!include' and '!includedir'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-Config-MySQL-0.02-2.36.noarch.rpm"
RPM_HASH = "ff60272798fd670c06ec7c42f5c30d8fd22dea8d43304e82dcdfcef48b20ff9dcc0af6865c2ff1857e615ad10a6c4116010eb447966004478cf9086b2113904e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--MySQL \
perl-Config--MySQL--Reader \
perl-Config--MySQL--Writer \
perl-Config-MySQL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Config--INI--Reader \
perl-Config--INI--Writer"

inherit rpm
