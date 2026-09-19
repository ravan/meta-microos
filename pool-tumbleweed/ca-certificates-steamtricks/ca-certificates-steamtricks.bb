SUMMARY = "Provides /etc/ssl/certs/ca-certificates.crt"
DESCRIPTION = "Provides /etc/ssl/certs/ca-certificates.crt as required by certain proprietary \
software. \
 \
This package was created as part of a workaround by steamtricks."
LICENSE = "GPL-2.0"

PV = "1"

RPM_NAME = "ca-certificates-steamtricks-1-1.22.noarch.rpm"
RPM_HASH = "e4755da729ee22a19bfad43b756ab6da0f173efebda80f01af3058417a53afdae72454096bdc290fa16a1c6cacb6e74141c5da7315fb87964023441c3708969d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates-steamtricks \
steamtricks-data-252950-Rocket-League"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ca-certificates \
coreutils"

inherit rpm
