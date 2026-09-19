SUMMARY = "Testing TCP program"
DESCRIPTION = "Test::TCP is a test utility to test TCP/IP-based server programs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.220.0"

RPM_NAME = "perl-Test-TCP-2.220.0-1.5.noarch.rpm"
RPM_HASH = "3f7596b38baa6dae8fd0c34f792997ff4cb52546e90cc4a63bc1df4e02bf9a6a7c65b2a5df34f388f26fc660e7ae1891a9224d12a34e3c9571d54ce6fedae0b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--EmptyPort \
perl-Test--TCP \
perl-Test--TCP--CheckPort \
perl-Test-TCP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--Socket--IP \
perl-Test--SharedFork"

inherit rpm
