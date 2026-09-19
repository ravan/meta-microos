SUMMARY = "Perl module to automatically format columnar data"
DESCRIPTION = "The *ShowTable* module provides subroutines to display tabular data, \
typially from a database, in nicely formatted columns, in several formats. \
Its arguments can either be given in a fixed order, or, as a single, \
anonymous hash-array. \
 \
The output format for any one invocation can be one of four possible \
styles: \
 \
* Box \
 \
A tabular format, with the column titles and the entire table surrounded by \
a 'box' of ''+'', ''-'', and ''|'' characters. See 'ShowBoxTable' for \
details. \
 \
* Table \
 \
A simple tabular format, with columns automatically aligned, with column \
titles. See 'ShowSimpleTable'. \
 \
* List \
 \
A _list_ style, where columns of data are listed as a _name_:_value_ pair, \
one pair per line, with rows being one or more column values, separated by \
an empty line. See 'ShowListTable'. \
 \
* HTML \
 \
The data is output as an HTML _TABLE_, suitable for display through a \
_Web_-client. See 'ShowHTMLTable'. Input can either be plain ASCII text, or \
text with embedded HTML elements, depending upon an argument or global \
parameter. \
 \
The subroutines which perform these displays are listed below."
LICENSE = "GPL-2.0-or-later"

PV = "4.600.0"

RPM_NAME = "perl-Data-ShowTable-4.600.0-1.9.noarch.rpm"
RPM_HASH = "09ec60ed924083cd033df4f3118eb97d265b86baa4f4fbfaecec4794546dcb966190261be3088ab9104c9db67ccf251728ea8e7f36c8fe7ef591cb4c921404c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--ShowTable \
perl-Data-ShowTable"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
