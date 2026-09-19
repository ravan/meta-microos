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

RPM_NAME = "python314-legacycrypt-0.3-2.1.noarch.rpm"
RPM_HASH = "60ae3242fa744c8140c725aecd611ca4c2415d0aaed4690dd444cebd1bbf77db7a330127918fdd6bbac38411cfd43b92070ed855d4b658806997f35260ba93e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-legacycrypt \
python314-legacycrypt \
python3dist-legacycrypt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
