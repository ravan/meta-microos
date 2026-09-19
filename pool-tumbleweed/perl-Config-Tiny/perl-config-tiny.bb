SUMMARY = "Read/Write .ini style files with as little code as possible"
DESCRIPTION = "'Config::Tiny' is a Perl class to read and write .ini style configuration \
files with as little code as possible, reducing load time and memory \
overhead. \
 \
Most of the time it is accepted that Perl applications use a lot of memory \
and modules. \
 \
The '*::Tiny' family of modules is specifically intended to provide an \
ultralight alternative to the standard modules. \
 \
This module is primarily for reading human written files, and anything we \
write shouldn't need to have documentation/comments. If you need something \
with more power move up to Config::Simple, Config::General or one of the \
many other 'Config::*' modules. \
 \
Lastly, Config::Tiny does *not* preserve your comments, whitespace, or the \
order of your config file. \
 \
See Config::Tiny::Ordered (and possibly others) for the preservation of the \
order of the entries in the file."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.300.0"

RPM_NAME = "perl-Config-Tiny-2.300.0-2.12.noarch.rpm"
RPM_HASH = "59bc5712f4b753ccc59a7961c47fe9a2931e62116d9e494280092d6a0ab98a1a716660801593d5a47ba7bd7402f6cad36e31269374ed5a659f92d3147dcb8fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Tiny \
perl-Config-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Spec \
perl-File--Temp"

inherit rpm
