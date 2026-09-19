SUMMARY = "A Key Management Application for SSH2 RSA/DSA and GnuPG Keys"
DESCRIPTION = "Keychain is an extremely handy OpenSSH, commercial SSH2-compatible \
RSA/DSA and GnuPG key management application. It acts as a front-end to \
the agents, allowing you to easily have one long-running agent process \
per system, rather than per login session. This dramatically reduces \
the number of times you need to enter your pass phrase from once per \
new login session to once every time your local machine is rebooted."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "keychain-2.8.5-3.4.noarch.rpm"
RPM_HASH = "fa2a27059e48cdb3e46a451738f24a25945bf57d04e7658e2b29ddfca964764c49440ae441c74048f3301608d4f9027c511689234c5be93743f4cb7c449f8c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keychain"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
coreutils \
gpg \
openssh-clients \
sed"

inherit rpm
