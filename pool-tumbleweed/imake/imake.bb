SUMMARY = "C preprocessor interface to the make utility"
DESCRIPTION = "Imake is used to generate Makefiles from a template, a set of cpp macro \
functions, and a per-directory input file called an Imakefile. \
 \
The X Window System used imake extensively up through the X11R6.9 \
release, for both full builds within the source tree and external \
software. X has since moved to GNU autoconf and automake for its build \
system in X11R7.0 and later releases, but still maintains imake for \
building existing external software programs that have not yet \
converted."
LICENSE = "MIT"

PV = "1.0.11"

RPM_NAME = "imake-1.0.11-1.4.aarch64.rpm"
RPM_HASH = "dfeeb6742b389adbe6fa9ead7cd343caf753821c963f0ea34c11ce99ca9039df61d05c7c63a07cacc2c39828ec2568a41a4d16a76e56781784e4fa5918922d64"

RPROVIDES:${PN} += "imake"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
xorg-cf-files"

inherit rpm
