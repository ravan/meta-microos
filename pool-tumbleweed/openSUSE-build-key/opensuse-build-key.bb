SUMMARY = "The public gpg keys for rpm package signature verification"
DESCRIPTION = "This package contains the gpg keys that are used to sign the \
openSUSE rpm packages. The keys installed here are not actually \
used by anything. rpm/zypper use the keys in the rpm db instead."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "openSUSE-build-key-1.0-68.1.aarch64.rpm"
RPM_HASH = "787beacba04d885b7fa2b849437942bec08f47767fbdb51600c4cf610bce6d07a9f8947606e272525804569395888facdeca733c4a991e6c9de98f0bba912f22"

RPROVIDES:${PN} += "build-key \
openSUSE-build-key"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
