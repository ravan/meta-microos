SUMMARY = "Boot logging"
DESCRIPTION = "The blogd daemon determines the real underlying character device of \
/dev/console. Blogd spawns a pty/tty pair to reconnect the current \
/dev/console with the slave of the pty/tty pair. During writing \
information from this slave to the real character device a ring \
buffer is used to hold the information for writing it to an existing \
logging file."
LICENSE = "GPL-2.0-or-later"

PV = "2.48"

RPM_NAME = "blog-2.48-1.1.aarch64.rpm"
RPM_HASH = "82eca14186f248f818564943817bd29622c4766d3064264085d7519a15ffd409282d460ff774576db216c02fe5b6be5ea43e59cba9416b74cde900b514995250"

RPROVIDES:${PN} += "/sbin/isserial \
blog \
sysvinit-tools-/sbin/blogd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
coreutils \
ld-linux-aarch64.so.1 \
libblogger.so.2 \
libc.so.6"

inherit rpm
