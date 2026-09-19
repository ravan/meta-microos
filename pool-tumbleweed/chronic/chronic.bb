SUMMARY = "Runs a command quietly unless it fails"
DESCRIPTION = "chronic runs a command, and arranges for its standard out and standard \
error to only be displayed if the command fails (exits nonzero or crashes). \
If the command succeeds, any extraneous output will be hidden. \
 \
A common use for chronic is for running a cron job. Rather than \
trying to keep the command quiet, and having to deal with mails containing \
accidental output when it succeeds, and not verbose enough output when it \
fails, you can just run it verbosely always, and use chronic to hide \
the successful output."
LICENSE = "GPL-2.0-or-later"

PV = "0.70"

RPM_NAME = "chronic-0.70-1.9.noarch.rpm"
RPM_HASH = "407814bab5711c8d7301b135657dbca360ec763cb87f306134bb365b97172d15e624799bd1c631604a91522074c57ee7d322cb4d7fce6005d08925bc9ad0411b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chronic \
moreutils-/usr/bin/chronic"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Getopt--Std \
perl-IPC--Run \
perl-strict \
perl-warnings"

inherit rpm
