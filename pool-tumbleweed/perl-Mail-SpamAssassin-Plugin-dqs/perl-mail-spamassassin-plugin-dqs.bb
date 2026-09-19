SUMMARY = "SpamAssassin plugin for Spamhaus Data Query Service (DQS)"
DESCRIPTION = "The Spamhaus Data Query Service (DQS) plugin for SpamAssassin enhances \
existing functions by checking HELO/EHLO, From, Reply-To, Envelope-From \
and Return-Path against Spamhaus DBL/ZRD blacklists. It also scans the \
e-mail body for e-mail addresses and performs blacklist lookups against \
the domains or its authoritative nameservers. Further checks cover the \
reverse DNS matches in DBL/ZRD blacklists or the SBL/CSS lookups for IP \
addresses or IP addresses of authoritative nameservers of domains being \
part of the e-mail body. \
 \
While the DQS usage is free under the same terms like when using public \
mirrors (which are shipped in SpamAssassin as default configuration), a \
registration procedure for a free DQS key is mandatory nevertheless."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "perl-Mail-SpamAssassin-Plugin-dqs-1.5.1-1.12.aarch64.rpm"
RPM_HASH = "42334d35247529b6ff4a91e2ca47a6e6e9d5bbdde0e1f43c8b965ffe7ca02f5478f7b35bb40d696a65f5721d36b0792a0f323c83474b226607fabadb48c4eca3"

RPROVIDES:${PN} += "config-perl-Mail-SpamAssassin-Plugin-dqs \
perl-Mail--SpamAssassin--Plugin--SH \
perl-Mail-SpamAssassin-Plugin-dqs"

RDEPENDS:${PN} += "/usr/bin/bash \
perl--MODULE-COMPAT-5.44.0 \
spamassassin"

inherit rpm
