SUMMARY = "BSD Sendmail Starttls helper scripts"
DESCRIPTION = "This package includes the directory layout as well as some useful \
helper scripts for better SSL/TLS support. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.18.2"

RPM_NAME = "sendmail-starttls-8.18.2-3.3.noarch.rpm"
RPM_HASH = "2e9eb14102c5fe7975e08f02d9dadc09154cd8c914e1ae17f13e9d7cb875b50eb45d1b045489df51d2871fd7f2d17d23b1b0a253244097cae38be8f7fecc3152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sendmail-starttls \
sendmail-starttls"

RDEPENDS:${PN} += "/usr/bin/bash \
cyrus-sasl-saslauthd \
openssl"

inherit rpm
