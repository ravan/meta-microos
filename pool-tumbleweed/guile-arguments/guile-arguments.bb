SUMMARY = "Parser for breaking down command line arguments into structured objects"
DESCRIPTION = "guile-arguments is a Guile Scheme library to parse command line \
arguments into structured objects, much like (ice-9 getopt-long). \
Its API allows declaring arguments through a small DSL, then call \
a procedure to parse the command line into a structured object."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.0"

RPM_NAME = "guile-arguments-0.2.0-1.2.aarch64.rpm"
RPM_HASH = "0587d349aef6f6469ff76540d1bc836f5af267f48ceb2707596332bcddeaaa8777745e69ad44a42ee3faa681b36cbb72f02bf0c2015d12c1af1425cccf87d334"

RPROVIDES:${PN} += "guile-arguments"

RDEPENDS:${PN} += "/usr/bin/sh \
guile"

inherit rpm
