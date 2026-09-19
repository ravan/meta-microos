SUMMARY = "Utilities for system wide CA certificate installation"
DESCRIPTION = "Update-ca-certificates is intended to keep the certificate stores of \
SSL libraries like OpenSSL or GnuTLS in sync with the system's CA \
certificate store that is managed by p11-kit."
LICENSE = "GPL-2.0-or-later"

PV = "2+git20260727.241e0ff"

RPM_NAME = "ca-certificates-2+git20260727.241e0ff-1.1.noarch.rpm"
RPM_HASH = "e076a078f4041a7d6e09d44ec221329f65bf0f22106b7da2e3a0dfca2fe6ef5873ac0c7cd6fea593892dc9f1471bd379dc143ad2d30f4a94ff3709428c4b8bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates \
java-ca-certificates"

RDEPENDS:${PN} += "/usr/bin/readlink \
/usr/bin/sh \
coreutils \
p11-kit \
p11-kit-tools"

inherit rpm
