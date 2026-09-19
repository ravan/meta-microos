SUMMARY = "Extension to the parse module"
DESCRIPTION = "parse_type extends the parse module (opposite of string.format()) with \
the following features: \
 \
  * build type converters for common use cases (enum/mapping, choice) \
  * build a type converter with a cardinality constraint (0..1, 0..*, 1..*) \
    from the type converter with cardinality=1. \
  * compose a type converter from other type converters \
  * an extended parser that supports the CardinalityField naming schema \
    and creates missing type variants (0..1, 0..*, 1..*) from the \
    primary type converter"
LICENSE = "MIT"

PV = "0.6.6"

RPM_NAME = "python314-parse_type-0.6.6-1.3.noarch.rpm"
RPM_HASH = "58aa99516b696a7250d58050b95f423336c631ae7054dae596e1cfadb4166f47b86009cf29e55b151f86d047308f15e795c3032964b0a4aa2bce5ac10b73a7c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parse-type \
python314-parse-type \
python3dist-parse-type"

RDEPENDS:${PN} += "python-abi \
python314-parse"

inherit rpm
