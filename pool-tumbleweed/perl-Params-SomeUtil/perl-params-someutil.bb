SUMMARY = "Simple, compact and correct param-checking functions"
DESCRIPTION = "'Params::SomeUtil' provides a basic set of importable functions that makes \
checking parameters a hell of a lot easier. This module is a fork of \
version 1.07 of Params::Util with some additional bug fixes, see WHY below. \
 \
While they can be (and are) used in other contexts, the main point behind \
this module is that the functions *both* Do What You Mean, and Do The Right \
Thing, so they are most useful when you are getting params passed into your \
code from someone and/or somewhere else and you can't really trust the \
quality. \
 \
Thus, 'Params::SomeUtil' is of most use at the edges of your API, where \
params and data are coming in from outside your code. \
 \
The functions provided by 'Params::SomeUtil' check in the most strictly \
correct manner known, are documented as thoroughly as possible so their \
exact behaviour is clear, and heavily tested so make sure they are not \
fooled by weird data and Really Bad Things. \
 \
To use, simply load the module providing the functions you want to use as \
arguments (as shown in the SYNOPSIS). \
 \
To aid in maintainability, 'Params::SomeUtil' will *never* export by \
default. \
 \
You must explicitly name the functions you want to export, or use the \
':ALL' param to just have it export everything (although this is not \
recommended if you have any _FOO functions yourself with which future \
additions to 'Params::SomeUtil' may clash)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.110.0"

RPM_NAME = "perl-Params-SomeUtil-1.110.0-1.1.aarch64.rpm"
RPM_HASH = "094417dd49cf9e3ce767d17f07275b94b17029822340e198d8a7a83dcdef02da597f583dbb83e33e46b977cbbae1940e92fec99417df7b89192e7dca5fcd4539"

RPROVIDES:${PN} += "perl-Params--SomeUtil \
perl-Params-SomeUtil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
