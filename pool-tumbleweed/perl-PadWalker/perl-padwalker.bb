SUMMARY = "Play with other peoples' lexical variables"
DESCRIPTION = "PadWalker is a module which allows you to inspect (and even change!) \
lexical variables in any subroutine which called you. It will only show \
those variables which are in scope at the point of the call. \
 \
PadWalker is particularly useful for debugging. It's even used by Perl's \
built-in debugger. (It can also be used for evil, of course.) \
 \
I wouldn't recommend using PadWalker directly in production code, but it's \
your call. Some of the modules that use PadWalker internally are certainly \
safe for and useful in production."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.500.0"

RPM_NAME = "perl-PadWalker-2.500.0-1.10.aarch64.rpm"
RPM_HASH = "8879495c72e62fd3f5413e3d8c889b30f4a65e5ac31f8740afbb2ae040d3c58459680a548c3ea255bfb2bf899bb2582b7eecd320f23ed0f40bdfdd140d75856f"

RPROVIDES:${PN} += "perl-PadWalker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
