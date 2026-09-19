SUMMARY = "Strict, typed YAML parser"
DESCRIPTION = "StrictYAML is a type-safe YAML parser that parses and validates a \
restricted subset of the YAML specification. \
 \
Priorities: \
 \
 * No parsing of hard to read and insecure features of YAML like the \
   Norway problem. \
 * Strict validation of markup and straightforward type casting. \
 * Acting as a near-drop in replacement for pyyaml, ruamel.yaml or poyo. \
 * Comment preservation across a read-write cycle \
 * Speed is not a key concern"
LICENSE = "MIT"

PV = "1.7.3"

RPM_NAME = "python313-strictyaml-1.7.3-2.12.noarch.rpm"
RPM_HASH = "655583b435ec3657ed129231c713bf122e1b8132ab7b297e907a1e9fe6a7856f547e150aa7f391add25cce14712c7a8d02ad9d03e75d5efcc08a7f6f4c4099fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-strictyaml \
python3.13dist-strictyaml \
python313-strictyaml \
python3dist-strictyaml"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil"

inherit rpm
