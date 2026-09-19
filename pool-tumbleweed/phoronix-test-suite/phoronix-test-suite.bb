SUMMARY = "Comprehensive test and benchmarking platform"
DESCRIPTION = "The Phoronix Test Suite can be used for simply comparing your \
computer's performance or internal quality assurance purposes under \
Linux. Results from the Phoronix Test Suite are displayed in a results \
viewer with optional support for uploading them to PTS Global. This \
software is based upon the internal tools and extensive Linux \
benchmarking work done by Phoronix since 2004, with input from tier-one \
computer hardware vendors. The Phoronix Test Suite ships with over 50 \
tests and 20 suites."
LICENSE = "GPL-3.0-only"

PV = "10.8.4"

RPM_NAME = "phoronix-test-suite-10.8.4-4.10.noarch.rpm"
RPM_HASH = "2c1814126a1f4aa37d7c4f6e74d48c6ff8374e7aa6786e3e7055c0d6b0d7de6a62ee39aa9792a0b279a254d37566c01dde084a595dddbe39792164d222930b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-phoronix-test-suite \
phoronix-test-suite"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
php8 \
php8-curl \
php8-dom \
php8-gd \
php8-openssl \
php8-pcntl \
php8-posix \
php8-sockets \
php8-zip \
php8-zlib \
systemd \
xdg-utils"

inherit rpm
