SUMMARY = "A schema-based serialization and deserialization library"
DESCRIPTION = "An extensible package which can be used to: \
 \
- deserialize and validate a data structure composed of strings, \
  mappings, and lists. \
 \
- serialize an arbitrary data structure to a data structure composed \
  of strings, mappings, and lists."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "2.0"

RPM_NAME = "python313-colander-2.0-2.5.noarch.rpm"
RPM_HASH = "6867cb3acd9250ee68b36364454d87de48cb0d55b828df0e7b9c4b53052bc25bc60c8f7d58f86d07daba33950d72b8d778dca71a2fcebdcfdcdb94afa19746a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colander \
python3.13dist-colander \
python313-colander \
python3dist-colander"

RDEPENDS:${PN} += "python-abi \
python313-iso8601 \
python313-translationstring"

inherit rpm
