SUMMARY = "Read Record-Oriented Files"
DESCRIPTION = "This module is for reading record-oriented data in a delimited text file. \
The most common example have records separated by newlines and fields \
separated by commas or tabs, but this module aims to provide a consistent \
interface for handling sequential records in a file however they may be \
delimited. Typically this data lists the fields in the first line of the \
file, in which case you should call 'bind_header' to bind the field name \
(or not, and it will be called implicitly). If the first line contains \
data, you can still bind your own field names via 'bind_fields'. Either \
way, you can then use many methods to get at the data as arrays or hashes."
LICENSE = "GPL-2.0-only"

PV = "1.6.5"

RPM_NAME = "perl-Text-RecordParser-1.6.5-3.23.noarch.rpm"
RPM_HASH = "95c5eb98a13cca70bdbdae85d67ab0a961b712a0b8fedaa536e0d031362a685315cece69f3be10d7bbccddf50c95bce218764969414e8bac66faae645dace6d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--RecordParser \
perl-Text--RecordParser--Object \
perl-Text--RecordParser--Tab \
perl-Text-RecordParser"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor \
perl-IO--Scalar \
perl-List--MoreUtils \
perl-Readonly \
perl-Text--Autoformat"

inherit rpm
