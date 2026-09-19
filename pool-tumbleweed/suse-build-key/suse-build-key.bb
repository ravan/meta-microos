SUMMARY = "The public gpg key for rpm package signature verification"
DESCRIPTION = "This package contains the gpg keys that are used to sign the \
SUSE rpm packages. The keys installed here are not actually \
used by anything. rpm/zypper use the keys in the rpm db instead."
LICENSE = "GPL-2.0-or-later"

PV = "12.0"

RPM_NAME = "suse-build-key-12.0-23.1.noarch.rpm"
RPM_HASH = "1862311b617fc1cbaf27260cb013393c221f8660e29ac2ec20fbee77e8543e779d49f3df1d6b72ba34454bed957146b44834408aaaa60293d9d6c26a4321dade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-key \
suse-build-key"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
