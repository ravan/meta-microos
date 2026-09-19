SUMMARY = "A Bash Attachment Mailer"
DESCRIPTION = "BIABAM is a small tool, useful when you want to mail attachments from \
the command line. It has similarities to mailing attachments from the \
commandline with Mutt, but it only depends on bash and uuencode."
LICENSE = "GPL-2.0+"

PV = "0.9.7"

RPM_NAME = "biabam-0.9.7-160.18.noarch.rpm"
RPM_HASH = "d093f1e936619b6e1e5e4f979cee289e0008bfd7dad3b732988aeb0fbd547ecdca70cffa7827d24430941dcf0afe7d28dbaf8eec11ccb57479f35986d318e77e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "biabam"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/sbin/sendmail \
sharutils"

inherit rpm
