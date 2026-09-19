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

RPM_NAME = "python313-itsdangerous-2.2.0-1.8.noarch.rpm"
RPM_HASH = "41613df2c8ca1e35039c9cda3ccca5ab9412030cd670edd2efe71567c90e29d6c941d6f1b9dd12c52f1a4218d0414e43312d2d9816fe399b6f9846c65f8ea3c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-itsdangerous \
python3.13dist-itsdangerous \
python313-itsdangerous \
python3dist-itsdangerous"

RDEPENDS:${PN} += "python-abi"

inherit rpm
