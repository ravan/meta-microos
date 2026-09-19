SUMMARY = "(DEPRECATED) module for sending mails with attachments through an SMTP server"
DESCRIPTION = "Mail::Sender is deprecated. Email::Sender is the go-to choice when you need \
to send Email from Perl. Go there, be happy! \
 \
Mail::Sender provides an object-oriented interface to sending mails. It \
directly connects to the mail server using IO::Socket."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.903"

RPM_NAME = "perl-Mail-Sender-0.903-1.39.noarch.rpm"
RPM_HASH = "42c8099af26eb378d81eade5a67812dc0abb72f1498ff13ec2bf88023d32115266a7d149b00dc863cfc627e9abe049fa56509376e430ea156a20b015ac60117f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Sender \
perl-Mail--Sender--CType--Ext \
perl-Mail--Sender--CType--Win32 \
perl-Mail-Sender"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
