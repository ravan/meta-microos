SUMMARY = "Development files for libpst, a .pst file reader"
DESCRIPTION = "libpst is a library that can decode the email messages stored in a \
'PST' file as created by Outlook. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libpst."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst-devel-0.6.76-3.6.aarch64.rpm"
RPM_HASH = "9bf3431e19201d058e58b43060502487336a57689d14abc149c95b6809b613a4b766b534dc28c9ee5f2aaf37a861027dfd3837263e9c6e818a0b0f9819d67e59"

RPROVIDES:${PN} += "libpst-devel \
pkgconfig-libpst"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpst4"

inherit rpm
