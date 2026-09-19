SUMMARY = "A library for testing Python applications in krb5 environments"
DESCRIPTION = "k5test is a library for setting up self-contained Kerberos 5 environments, \
and running Python unit tests inside those environments.  It is based on \
the file of the same name found alongside the MIT Kerberos 5 unit tests."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "python313-k5test-0.10.4-3.4.noarch.rpm"
RPM_HASH = "da85da1b1dad8c3092ea3fc384e1763f93dd0e31a7258a6c43c888a4d6e83f6a4017ba3d33aed206d44f482aacad1ed9b8fefe97110bd982d0bc69d4987b613c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-k5test \
python3.13dist-k5test \
python313-k5test \
python3dist-k5test"

RDEPENDS:${PN} += "krb5-client \
krb5-server \
pkgconfig-krb5 \
python-abi"

inherit rpm
