SUMMARY = "GNU Command Line Calculator"
DESCRIPTION = "bc is an interpreter that supports numbers of arbitrary precision and \
the interactive execution of statements. The syntax has some \
similarities to the C programming language. A standard math library is \
available through command line options. When used, the math library is \
read in before any other input files. bc then reads in all other files \
from the command line, evaluating their contents. Then bc reads from \
standard input (usually the keyboard). \
 \
The dc program is also included. dc is a calculator that supports \
reverse-polish notation and allows unlimited precision arithmetic. \
Macros can also be defined. Normally, dc reads from standard input but \
can also read in files specified on the command line. A calculator with \
reverse-polish notation saves numbers to a stack. Arguments to \
mathematical operations (operands) are 'pushed' onto the stack until \
the next operator is read in, which 'pops' its arguments off the stack \
and 'pushes' its results back onto the stack."
LICENSE = "GFDL-1.2-or-later & GPL-3.0-or-later"

PV = "1.08.2"

RPM_NAME = "bc-1.08.2-1.6.aarch64.rpm"
RPM_HASH = "3b57294c0eb9043c8c4c3efff8e0e18af65004cca7a730c090aa12253f2336920632d91bc32761e084e393a43daf2d4156953115b8db7e8042737599ecdf53c4"

RPROVIDES:${PN} += "bc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
