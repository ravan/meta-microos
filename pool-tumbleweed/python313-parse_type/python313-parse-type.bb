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

RPM_NAME = "python313-parse_type-0.6.6-1.3.noarch.rpm"
RPM_HASH = "36aae2510b6de5c40e7c621e7749e79cdb2f2d5117c426c2a8ad71af7356085ee13d7ae1566fc4d0f21d8224c17fe536bdacd68517e5cb0107c22b9a2b2a9f37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parse-type \
python3.13dist-parse-type \
python313-parse-type \
python3dist-parse-type"

RDEPENDS:${PN} += "python-abi \
python313-parse"

inherit rpm
