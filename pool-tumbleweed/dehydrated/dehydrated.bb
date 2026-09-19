SUMMARY = "A client for signing certificates with an ACME server"
DESCRIPTION = "This is a client for signing certificates with an ACME server \
(currently only provided by letsencrypt) implemented as a relatively \
simple bash-script. \
 \
It uses the openssl utility for everything related to actually \
handling keys and certificates, so you need to have that installed. \
 \
Other dependencies are: curl, sed, grep, mktemp (all found on almost \
any system, curl being the only exception)."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "dehydrated-0.7.1-3.8.noarch.rpm"
RPM_HASH = "82fb1cffc5452b6fa88f27fc693cf2eca20b61e848772d8f3e47a658a3e5dedd0ab4830e66c90818df31f54d966ac6eed13744944b68ce8f080be6cec6a73743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dehydrated \
dehydrated \
group-dehydrated \
letsencrypt.sh \
user-dehydrated"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/getent \
/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
coreutils \
curl \
openssl \
sudo \
sysuser-shadow"

inherit rpm
