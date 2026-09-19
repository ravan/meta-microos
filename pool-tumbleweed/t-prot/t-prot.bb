SUMMARY = "A Display Filter for RFC822 Messages"
DESCRIPTION = "t-prot detects and, when demanded, hides annoying parts in rfc822 \
messages: TOFU (see below), huge quoted blocks, signatures (especially \
when they are too long), excessive punctuation, blocks of empty lines, \
and trailing spaces and tabs. For use inside of MTAs or MDAs, it may \
exit with appropriate libc exit codes, so annoying messages may be \
bounced easily. \
 \
TOFU is an abbreviation that mixes German and English words. It expands \
to 'text oben, full-quote unten' that means 'text above - full quote \
below' and describes the style of many users who let their mailer or \
newsreader quote everything of the previous message and just add some \
text at the top."
LICENSE = "BSD-4-Clause"

PV = "3.4"

RPM_NAME = "t-prot-3.4-1.24.noarch.rpm"
RPM_HASH = "0e61ece2ecd4dc6b381def99c18a79c6c2bc241f463d4d8acb7464aaf6fafca4ce16fadbcb7562dea3aa3ee905f6395125441676c6e4d3b309085b5794e48d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "t-prot"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Getopt--Long \
perl-Locale--gettext"

inherit rpm
