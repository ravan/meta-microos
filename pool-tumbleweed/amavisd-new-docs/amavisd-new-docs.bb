SUMMARY = "Documentation for the High-Performance E-Mail Virus Scanner"
DESCRIPTION = "Amavisd-new is a high-performance interface between mailer (MTA) and \
content checkers: virus scanners or SpamAssassin. It talks to the MTA \
via (E)SMTP, LMTP. \
 \
This package contains the documentation and Release-Notes."
LICENSE = "GPL-2.0-or-later"

PV = "2.14.0"

RPM_NAME = "amavisd-new-docs-2.14.0-1.5.noarch.rpm"
RPM_HASH = "657699a9f8037b86a1a63bcb7fbcf6cbc119281bbf0355bf13a3f972e487df973e30d7ccfa2cdf99c5e97bb593e15765cb137689403283e5716a9837fb84b901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amavisd-new-docs"

RDEPENDS:${PN} += ""

inherit rpm
