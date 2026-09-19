SUMMARY = "IMAP de-duplication tool"
DESCRIPTION = "A duplicate email message remover \
 \
IMAPdedup is a command-line utility that looks for duplicate messages in a set \
of IMAP mailboxes and tidies up all but the first copy of any duplicates found. \
 \
To be more exact, it *marks* the second and later occurrences of a message as \
'deleted' on the server.   Exactly what that does in your environment will \
depend on your mail server and your mail client. \
 \
Some mail clients will let you still view such messages *in situ*, so you can \
take a look at what's happened before 'compacting' the mailbox.  Sometimes \
deleted messages appear in a 'Trash' folder.  Sometimes they are hidden and can \
be displayed and un-deleted if wanted, until they are purged. \
 \
Whatever your system does, you will usually have the option to see what has \
been deleted, and to recover it if needed, using your email program, after \
running this script.  (If your server purges the deleted messages \
automatically, you may be able to prevent this with the `--no-close` option.) \
There is also a 'dry-run' option so you can check what might happen before \
doing anything scary."
LICENSE = "GPL-2.0-only"

PV = "1.2"

RPM_NAME = "python3-imapdedup-1.2-1.8.noarch.rpm"
RPM_HASH = "b8bb7626731c7f3ff63484bc47dd23ebfd68ee10d35db58c326f29cdcd41a36fab81a2c2d65d14cbb00f345f5aec2b17cab2870c5afd5010c5f12e346cf1d73e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imapdedup \
python3.13dist-imapdedup \
python3dist-imapdedup"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
