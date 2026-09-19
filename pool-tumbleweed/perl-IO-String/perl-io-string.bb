SUMMARY = "Emulate file interface for in-core strings"
DESCRIPTION = "The 'IO::String' module provides the 'IO::File' interface for in-core \
strings. An 'IO::String' object can be attached to a string, and makes it \
possible to use the normal file operations for reading or writing data, as \
well as for seeking to various locations of the string. This is useful when \
you want to use a library module that only provides an interface to file \
handles on data that you have in a string variable. \
 \
Note that perl-5.8 and better has built-in support for 'in memory' files, \
which are set up by passing a reference instead of a filename to the open() \
call. The reason for using this module is that it makes the code backwards \
compatible with older versions of Perl. \
 \
The 'IO::String' module provides an interface compatible with 'IO::File' as \
distributed with _IO-1.20_, but the following methods are not available: \
new_from_fd, fdopen, format_write, format_page_number, \
format_lines_per_page, format_lines_left, format_name, format_top_name."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.80.0"

RPM_NAME = "perl-IO-String-1.80.0-1.5.noarch.rpm"
RPM_HASH = "b2dde691d545e19632d998906671b9ade7427840b24a26ee5b08f1230be4609e9cc4ae4fd6e9ec3d3ca3977959fe5d9702767afcdbbabf7b74d858ce233eb92e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--String \
perl-IO-String"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
