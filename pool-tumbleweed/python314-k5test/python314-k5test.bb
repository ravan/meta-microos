SUMMARY = "A library for testing Python applications in krb5 environments"
DESCRIPTION = "k5test is a library for setting up self-contained Kerberos 5 environments, \
and running Python unit tests inside those environments.  It is based on \
the file of the same name found alongside the MIT Kerberos 5 unit tests."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "python314-k5test-0.10.4-3.4.noarch.rpm"
RPM_HASH = "b28c2e2085aa10988fa7885683c24f005d7e212699df20487c9866120f871a9ce2faf9e35be4a7177434c086cf7bfaa5665c52eef7ad6156eeaa619a041d4a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-k5test \
python314-k5test \
python3dist-k5test"

RDEPENDS:${PN} += "krb5-client \
krb5-server \
pkgconfig-krb5 \
python-abi"

inherit rpm
