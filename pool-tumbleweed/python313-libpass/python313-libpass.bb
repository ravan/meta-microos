SUMMARY = "Fork of passlib, a comprehensive password hashing framework"
DESCRIPTION = "This is a fork of https://foss.heptapod.net/python-libs/passlib \
 \
Passlib is a password hashing library for Python 3, which provides \
cross-platform implementations of over 30 password hashing algorithms, as well \
as a framework for managing existing password hashes. It's designed to be useful \
for a wide range of tasks, from verifying a hash found in /etc/shadow, to \
providing full-strength password hashing for multi-user application."
LICENSE = "BSD-3-Clause"

PV = "1.9.3"

RPM_NAME = "python313-libpass-1.9.3-1.3.noarch.rpm"
RPM_HASH = "7371b4af436d52a173b521f9094d9eda7e94bd73742c160c2ba0612f0f1d8d3becd46fe12a9134993de5c61f6d969976f6529b9dcf767041fa7c7eb416ecf1bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libpass \
python3.13dist-libpass \
python313-libpass \
python3dist-libpass"

RDEPENDS:${PN} += "python-abi"

inherit rpm
