SUMMARY = "Data validation library"
DESCRIPTION = "Schema is a library for validating Python data structures, such as those \
obtained from config-files, forms, external services or command-line \
parsing, converted from JSON/YAML (or something else) to Python data-types."
LICENSE = "MIT"

PV = "0.7.8"

RPM_NAME = "python313-schema-0.7.8-1.4.noarch.rpm"
RPM_HASH = "9f07f255ba5e0d6b584bf843262bdd20cac7377248a1f2946e2698b602b0a3137745827e4ceb70cf74e6ab1d2e9eaabacbd70e904e0810c248ac3bc534c77c1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-schema \
python3.13dist-schema \
python313-schema \
python3dist-schema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
