SUMMARY = "A log colorizer"
DESCRIPTION = "CCZE is a modular log colorizer, with plugins for apm, \
exim, fetchmail, httpd, postfix, procmail, squid, syslog, ulogd, \
vsftpd, xferlog and more."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.2"

RPM_NAME = "ccze-0.2.1.2-4.5.aarch64.rpm"
RPM_HASH = "c1cfca97101316d46a67b68a0218e8a4f0e60b4991a3de6937a87eaa55e36d8cad640d8926648ab2a48307e767b7327a282bff2c8115f0bb6ac3839b3b2fecfe"

RPROVIDES:${PN} += "ccze \
config-ccze"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libpcre2-8.so.0 \
libtinfo.so.6"

inherit rpm
