SUMMARY = "Sendmail milter for amavisd-new using the AM.PDP protocol"
DESCRIPTION = "The amavisd-milter is a sendmail milter (mail filter) for amavisd-new \
2.4.3 (and above) and sendmail 8.12 (and above) which use the new AM.PDP \
protocol."
LICENSE = "BSD-3-Clause"

PV = "1.7.2"

RPM_NAME = "amavisd-milter-1.7.2-2.5.aarch64.rpm"
RPM_HASH = "0cded3d97ada85b1455eb62e10b50892caeb56c681e7051b0a31a3addcbe1c432070e140840dd9a15c2219cba470bebfe63cbeb6cded30c86c016452af2040aa"

RPROVIDES:${PN} += "amavisd-milter"

RDEPENDS:${PN} += "/usr/bin/sh \
amavisd-new \
libc.so.6 \
libmilter.so.1.0"

inherit rpm
