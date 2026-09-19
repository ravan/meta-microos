SUMMARY = "Various helpers to pass trusted data to untrusted environments and back"
DESCRIPTION = "It's Dangerous \
   ... so better sign this \
 \
Various helpers to pass data to untrusted environments and to get it back \
safe and sound. \
 \
This repository provides a module that is a port of the django signing \
module.  It's not directly copied but some changes were applied to \
make it work better on its own. \
 \
Also I plan to add some extra things.  Work in progress."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python314-itsdangerous-2.2.0-1.8.noarch.rpm"
RPM_HASH = "e0390466406d23a5bace7eaca31f5cec38d0ca34c63be5af61b3048801cecd6cdffce0e93fccecf943e5d73202a50c7f92f9418d04974e09e7451d1cf312ccd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-itsdangerous \
python314-itsdangerous \
python3dist-itsdangerous"

RDEPENDS:${PN} += "python-abi"

inherit rpm
