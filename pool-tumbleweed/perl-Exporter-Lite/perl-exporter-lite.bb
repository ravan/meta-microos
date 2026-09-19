SUMMARY = "Lightweight exporting of functions and variables"
DESCRIPTION = "Exporter::Lite is an alternative to Exporter, intended to provide a \
lightweight subset of the most commonly-used functionality. It supports \
'import()', '@EXPORT' and '@EXPORT_OK' and not a whole lot else. \
 \
Exporter::Lite simply exports its import() function into your namespace. \
This might be called a 'mix-in' or a 'role'. \
 \
When 'Exporter::Lite' was written, if you wanted to use 'Exporter' you had \
to write something like this: \
 \
 use Exporter; \
 our @ISA = qw/ Exporter /; \
 \
'Exporter::Lite' saved you from writing that second line. But since before \
2010 you've been able to write: \
 \
 use Exporter qw/ import /; \
 \
Which imports the 'import' function into your namespace from 'Exporter'. As \
a result, I would recommend that you use 'Exporter' now, as it's a core \
module (shipped with Perl). \
 \
To make sure you get a version of 'Exporter' that supports the above usage, \
specify a minimum version when you 'use' it: \
 \
 use Exporter 5.57 qw/ import /;"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Exporter-Lite-0.09-1.23.noarch.rpm"
RPM_HASH = "12e580ed37a6da015e2bf1f49f3a83468e85f6edf73393b11f2ca251fcaa8e702a05e3b66a0743e6fe483d9ba9f7995d611e1bbfb5b9d00422cf58d0dc2304d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exporter--Lite \
perl-Exporter-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
