SUMMARY = "Spammassassin Client"
DESCRIPTION = "Spamc is the client to contact the spammassassin spamd daemon. It should \
be used in place of 'spamassassin' in scripts to process mail."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "spamassassin-spamc-4.0.1-78.12.aarch64.rpm"
RPM_HASH = "3b5323c2a100cdbdd738190398cf084db544936ef941805e85df80d5817c2275366c57cdf80afd8f72cf78a7dae86735910d0d55a00bb6b2ab0b196aea5e8bc6"

RPROVIDES:${PN} += "spamassassin-spamc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
