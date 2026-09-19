SUMMARY = "KIWI Hook for Checking and Renaming the Live Images"
DESCRIPTION = "This package contains a script that is run after building the Live Images with KIWI."
LICENSE = "GPL-3.0-only"

PV = "1.0"

RPM_NAME = "live-kiwi-hook-1.0-7.1.noarch.rpm"
RPM_HASH = "0084a7b7a0d84a0864fcafc51a7eccebda6a0bfb34d3f66918afd11cb6af52f9332998f4ed793fddab73a2d279d45357d9865f36cd9d9d3664531f95802dabef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiwi-post-run \
live-kiwi-hook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
sed \
util-linux"

inherit rpm
