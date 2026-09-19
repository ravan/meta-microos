SUMMARY = "Swiss Army Knife for SMTP"
DESCRIPTION = "Swaks is a scriptable, transaction-oriented SMTP test \
tool. Features include: \
 \
* SMTP extensions including TLS, authentication, pipelining, and \
  XCLIENT \
* Protocols including SMTP, ESMTP, and LMTP \
* Transports including UNIX-domain sockets, internet-domain sockets \
  (IPv4 and IPv6), and pipes to spawned processes \
* Completely scriptable configuration, with option specification via \
  environment variables, configuration files, and command line"
LICENSE = "GPL-2.0-only"

PV = "20240103.0"

RPM_NAME = "swaks-20240103.0-2.8.noarch.rpm"
RPM_HASH = "1a7b0bf5205474ca87ec7097f8155057b0925ec8895907b572fde322a2c52dc3517bdb421651c49bac2650b0cf1d7d89aaffd6f4ce59c8206c25963cb053420a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swaks"

RDEPENDS:${PN} += "/usr/bin/env \
perl-IO--Socket--IP \
perl-Net--DNS \
perl-Net--SSLeay"

inherit rpm
