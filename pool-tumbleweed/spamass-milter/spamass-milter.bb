SUMMARY = "Milter (mail filter) for spamassassin"
DESCRIPTION = "A milter (Mail Filter) application that pipes incoming mail (including things \
received by rmail/UUCP) through SpamAssassin, a highly customizable spam \
filter. A milter-compatible MTA such as Sendmail or Postfix is required."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "spamass-milter-0.4.0-5.7.aarch64.rpm"
RPM_HASH = "c94707dee66f25dcf50ee499e7ae34a3bfb54a62cae34722a4b634b455007c6aba60ec2247e1860f228178f17f9759b7e8dd441701681e8f1e2e649dd0ecdf1e"

RPROVIDES:${PN} += "config-spamass-milter \
group-sa-milter \
spamass-milter \
user-sa-milter"

RDEPENDS:${PN} += "/usr/bin/sh \
group-postfix \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmilter.so.1.0 \
libstdc++.so.6 \
postfix \
spamassassin-spamc \
sysuser-shadow"

inherit rpm
