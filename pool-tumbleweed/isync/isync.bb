SUMMARY = "Utility to synchronize IMAP mailboxes with local maildir folders"
DESCRIPTION = "isync is a command line application which synchronizes mailboxes; currently \
Maildir and IMAP4 mailboxes are supported. New messages, message deletions \
and flag changes can be propagated both ways. isync is suitable for use in \
IMAP-disconnected mode. \
 \
Synchronization is based on unique message identifiers (UIDs), so no \
identification conflicts can occur (as opposed to some other mail \
synchronizers). Synchronization state is kept in one local text file per \
mailbox pair; multiple replicas of a mailbox can be maintained."
LICENSE = "GPL-2.0-only"

PV = "1.5.1"

RPM_NAME = "isync-1.5.1-1.6.aarch64.rpm"
RPM_HASH = "9032463e9a5905d83b4916fbf5271b0aa8ef9513c2a9a7798bc38317ccd8db495aed1a4659b1d9eda88d77069f1f622c32c108708559278a8f1fb0d996405760"

RPROVIDES:${PN} += "isync"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libsasl2.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
