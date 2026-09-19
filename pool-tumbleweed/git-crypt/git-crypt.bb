SUMMARY = "Transparent file encryption in git"
DESCRIPTION = "git-crypt enables transparent encryption and decryption of files in a git \
repository. Files which you choose to protect are encrypted when committed, and \
decrypted when checked out. git-crypt lets you freely share a repository \
containing a mix of public and private content. git-crypt gracefully degrades, \
so developers without the secret key can still clone and commit to a repository \
with encrypted files. This lets you store your secret material (such as keys or \
passwords) in the same repository as your code, without requiring you to lock \
down your entire repository."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "git-crypt-0.8.0-1.5.aarch64.rpm"
RPM_HASH = "23a6fc7ab66f167535d5382b33a31b00ff372b06f4a1806373df442f57a36239f280639b2cd1121d93ebe397a8c3e016d2fdf91abea425796111ac72655920be"

RPROVIDES:${PN} += "git-crypt"

RDEPENDS:${PN} += "git-core \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
