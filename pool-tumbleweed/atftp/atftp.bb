SUMMARY = "Advanced TFTP Server and Client"
DESCRIPTION = "atftp stands for Advanced Trivial File Transfer Protocol. It is called \
'advanced', in contrast to others TFTP servers, for two reasons. First, \
it is intended to be fully compliant with all related RFCs. This \
includes RFC1350, RFC2090, RFC2347, RFC2348, and RFC2349. Second, atftp \
is intended for serving boot files to large clusters. It is \
multithreaded and will eventually support multicast, allowing faster \
boot of hundreds of machines simultaneously."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "atftp-0.8.0-3.6.aarch64.rpm"
RPM_HASH = "dd1ccd9adc382cc220d93150ffbe3f90e0f093fec15e69daae844cf190dc99f344db93241aa15edd53742cb3d7e33aae48cc88ffe516d5a425bc7aeba9905e0d"

RPROVIDES:${PN} += "atftp \
tftp-client \
tftp-server"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-tftp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0 \
libreadline.so.8 \
user-tftp"

inherit rpm
