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

RPM_NAME = "python314-strictyaml-1.7.3-2.12.noarch.rpm"
RPM_HASH = "71442e5a95b4f482beb3725b369b3ab739cbb1abbdba53208bc5cf63176bff4a5b138410fae2ce6073dfe1b5ca4086ddee9f6c7bfff09c11fd9847b8299bf666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-strictyaml \
python314-strictyaml \
python3dist-strictyaml"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil"

inherit rpm
