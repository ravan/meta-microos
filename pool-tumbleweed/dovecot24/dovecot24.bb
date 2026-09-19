SUMMARY = "IMAP and POP3 Server Written Primarily with Security in Mind"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.4.5"

RPM_NAME = "dovecot24-2.4.5-2.1.aarch64.rpm"
RPM_HASH = "4d19196e15324c4032444af159dbcdf2740ae5b47f3c9360898caa1f58ec710bde6623c12475117b96a39cac73a366485215788fffce7c59e57d2587b8bbe88d"

RPROVIDES:${PN} += "config-dovecot24 \
dovecot-implementation \
dovecot24 \
lib01-acl-plugin.so \
lib01-apparmor-plugin.so \
lib01-mail-lua-plugin.so \
lib02-imap-acl-plugin.so \
lib02-lazy-expunge-plugin.so \
lib05-mail-crypt-acl-plugin.so \
lib05-pop3-migration-plugin.so \
lib10-doveadm-acl-plugin.so \
lib10-doveadm-quota-plugin.so \
lib10-doveadm-sieve-plugin.so \
lib10-last-login-plugin.so \
lib10-mail-crypt-plugin.so \
lib10-quota-plugin.so \
lib10-sieve-storage-ldap-plugin.so \
lib11-imap-quota-plugin.so \
lib11-trash-plugin.so \
lib15-notify-plugin.so \
lib20-charset-alias-plugin.so \
lib20-mail-compress-plugin.so \
lib20-mail-log-plugin.so \
lib20-notify-status-plugin.so \
lib20-push-notification-plugin.so \
lib20-quota-clone-plugin.so \
lib20-virtual-plugin.so \
lib22-push-notification-lua-plugin.so \
lib90-sieve-extprograms-plugin.so \
lib90-sieve-imapsieve-plugin.so \
lib90-sieve-plugin.so \
lib95-imap-filter-sieve-plugin.so \
lib95-imap-sieve-plugin.so \
lib99-welcome-plugin.so \
libauthdb-imap.so \
libauthdb-ldap.so \
libauthdb-lua.so \
libdcrypt-openssl.so \
libdict-ldap.so \
libdoveadm-mail-crypt-plugin.so \
libdovecot-compression.so.0 \
libdovecot-dsync.so.0 \
libdovecot-gssapi.so.0 \
libdovecot-language.so.0 \
libdovecot-lda.so.0 \
libdovecot-ldap.so.0 \
libdovecot-login.so.0 \
libdovecot-lua.so.0 \
libdovecot-managesieve.so.0 \
libdovecot-sieve.so.0 \
libdovecot-sql.so.0 \
libdovecot-storage-lua.so.0 \
libdovecot-storage.so.0 \
libdovecot.so.0 \
libfs-compress.so \
libfs-crypt.so \
libmanagesieve-login-settings.so \
libmanagesieve-settings.so \
libmech-gss-spnego.so \
libmech-gssapi.so \
libpigeonhole-settings.so \
libssl-iostream-openssl.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
dovecot \
ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libbz2.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libexttextcat-2.0.so.0 \
libgssapi-krb5.so.2 \
libicui18n.so.78 \
libicuuc.so.78 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
liblua5.4.so.5 \
liblz4.so.1 \
libm.so.6 \
libpam.so.0 \
libpcre2-32.so.0 \
libsodium.so.26 \
libssl.so.3 \
libstemmer.so.0d \
libsystemd.so.0 \
libunwind-aarch64.so.8 \
libunwind.so.8 \
libz.so.1 \
libzstd.so.1"

inherit rpm
