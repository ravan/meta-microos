SUMMARY = "Full-Featured POP and IMAP Mail Retrieval Daemon"
DESCRIPTION = "Fetchmail is a robust and well-documented remote mail retrieval and \
forwarding utility intended to be used over on-demand TCP/IP links \
(such as SLIP or PPP connections). \
 \
Fetchmail retrieves mail from remote mail servers and forwards it to \
your local machine's delivery system, so it can be read by normal mail \
user agents, such as mutt, elm, pine, (x)emacs/gnus, or mailx. \
 \
fetchmailconf, an interactive GUI configurator suitable for end-users, \
is included in the fetchmailconf package."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.1"

RPM_NAME = "fetchmail-6.6.1-3.3.aarch64.rpm"
RPM_HASH = "30d1cf13a2bbccb6779ba3a2764a1b673ae6d3f0638358f1147db5aceae4ff7f69cbe0dec350a307bac41713f99eed2a9d21a3508373bc758e9c957fecc042f3"

RPROVIDES:${PN} += "config-fetchmail \
fetchmail \
group-fetchmail \
user-fetchmail"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libssl.so.3 \
logrotate \
sysuser-shadow"

inherit rpm
