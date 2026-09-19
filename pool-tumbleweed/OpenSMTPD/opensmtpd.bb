SUMMARY = "A free implementation of the server-side SMTP protocol"
DESCRIPTION = "OpenSMTPD is a FREE implementation of the server-side SMTP protocol as defined by RFC 5321, with some additional standard extensions. \
 \
It allows ordinary machines to exchange e-mails with other systems speaking the SMTP protocol."
LICENSE = "BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & ISC"

PV = "7.9.0p0"

RPM_NAME = "OpenSMTPD-7.9.0p0-1.1.aarch64.rpm"
RPM_HASH = "d304b556a5e46f07449107e076ed381edafc492f7701b823f2074a183987293cc800456e55cfe0c3a6dd4d06c507b60a9a3108dc3ee816aad00ab44d90eeaac3"

RPROVIDES:${PN} += "OpenSMTPD \
config-OpenSMTPD \
group--smtpd \
group--smtpq \
smtp-daemon \
user--smtpd \
user--smtpq"

RDEPENDS:${PN} += "/usr/bin/sh \
filesystem \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libresolv.so.2 \
libssl.so.3 \
libz.so.1 \
permissions \
sysuser-shadow"

inherit rpm
