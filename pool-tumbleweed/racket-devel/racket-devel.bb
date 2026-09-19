SUMMARY = "Development header files for Racket"
DESCRIPTION = "This package contains the symlinks, headers and object files needed to \
compile and link programs which use Racket."
LICENSE = "Apache-2.0 | MIT"

PV = "9.1"

RPM_NAME = "racket-devel-9.1-1.6.aarch64.rpm"
RPM_HASH = "d807cbae20dcbe54f26a3796ec58299a9af183ac65672428dc0f239a2b917003a13651f64c3719760eb272628118dcb42d4d238e733a44446755d8b81a532efa"

RPROVIDES:${PN} += "racket-devel"

RDEPENDS:${PN} += "glibc-devel \
libffi-devel \
racket"

inherit rpm
