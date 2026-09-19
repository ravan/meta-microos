SUMMARY = "Module to serialize all of Python"
DESCRIPTION = "Dill extends python's `pickle` module for serializing and de-serializing \
python objects to the majority of the built-in python types. Serialization \
is the process of converting an object to a byte stream, and the inverse \
of which is converting a byte stream back to on python object hierarchy. \
 \
Dill provides the user the same interface as the `pickle` module, and \
also includes some additional features. In addition to pickling python \
objects, `dill` provides the ability to save the state of an interpreter \
session in a single command."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python313-dill-0.4.1-2.1.noarch.rpm"
RPM_HASH = "c9f4a64d2829a0ab439f54828a596137205bc75cc41ea4e89d87b4e5a591c01f72e10a1e71a0495d6652c07e3cd29c8b2cd35601bafc1c760df34c58c18152b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dill \
python3.13dist-dill \
python313-dill \
python3dist-dill"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
