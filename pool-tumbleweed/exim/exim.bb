SUMMARY = "The Exim Mail Transfer Agent, a Replacement for sendmail"
DESCRIPTION = "Exim is a mail transport agent (MTA) developed at the University of \
Cambridge for use on Unix systems connected to the Internet. It is \
freely available under the terms of the GNU General Public Licence. In \
style, it is similar to Smail 3, but its facilities are more extensive. \
In particular, it has options for verifying incoming sender and \
recipient addresses, for refusing mail from specified hosts, networks, \
or senders, and for controlling mail relaying."
LICENSE = "GPL-2.0-or-later"

PV = "4.98.2"

RPM_NAME = "exim-4.98.2-4.7.aarch64.rpm"
RPM_HASH = "6add1e8258bc2ee0e05a7f2ef577cf6344002a7e60db3a9f71ee33f1df3db325da21d7b51eaea802f386acef4ab254c92b1992e63f24e531d61a49ce67e78df6"

RPROVIDES:${PN} += "config-exim \
exim \
smtp-daemon"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fileutils \
fillup \
group-mail \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libdb-4.8.so \
liblber.so.2 \
libldap.so.2 \
libm.so.6 \
libmariadb.so.3 \
libpam.so.0 \
libpcre2-8.so.0 \
libpq.so.5 \
libsasl2.so.3 \
libspf2.so.2 \
libsqlite3.so.0 \
libssl.so.3 \
logrotate \
perl-File-FcntlLock \
permissions \
systemd \
textutils \
user-mail"

inherit rpm
