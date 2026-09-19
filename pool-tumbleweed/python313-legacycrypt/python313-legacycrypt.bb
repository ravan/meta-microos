SUMMARY = "Wrapper to the POSIX crypt library call and associated functionality"
DESCRIPTION = "The legacycrypt module is a standalone version of \
https://docs.python.org/3/library/crypt.html \
 \
This module implements an interface to the crypt(3) routine, which is a \
one-way hash function based upon a modified DES algorithm; see the Unix man \
page for further details. Possible uses include storing hashed passwords so \
you can check passwords without storing the actual password, or attempting \
to crack Unix passwords with a dictionary. \
 \
Notice that the behavior of this module depends on the actual \
implementation of the crypt(3) routine in the running system. Therefore, \
any extensions available on the current implementation will also be \
available on this module."
LICENSE = "Python-2.0"

PV = "0.3"

RPM_NAME = "python313-legacycrypt-0.3-2.1.noarch.rpm"
RPM_HASH = "1b39a15d53a79455b291ba9d07c587c089f87ce78f4fdaa50778d4b576a08bed38ddb7db11180a28e71af61c013ecff32df3996f977d73dea2f777b3faffd5e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-legacycrypt \
python3.13dist-legacycrypt \
python313-legacycrypt \
python3dist-legacycrypt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
