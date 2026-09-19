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

RPM_NAME = "python314-dill-0.4.1-2.1.noarch.rpm"
RPM_HASH = "5618ff4b3a1118a4e261c6bc4e2adae6370a5e08e3891935e6b8bc17ab099b6055b70072b356dbf198074077879ee2898a24e9dc1d736486527df24d288701e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dill \
python314-dill \
python3dist-dill"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
