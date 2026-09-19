SUMMARY = "OpenAPI (v3) specification schema as Pydantic classes"
DESCRIPTION = "OpenAPI (v3) specification schema expressed as Pydantic classes, for \
parsing, validating and generating OpenAPI documents in Python."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python314-openapi-pydantic-0.5.1-1.2.noarch.rpm"
RPM_HASH = "2933b384e7267da925f74183f21c584660076f6a51497c7bac589b04fc36c522a01542b905addb7c9d17b823e9cc893e9c91dc4a0e6ef3085eb00472e4ba7f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openapi-pydantic \
python314-openapi-pydantic \
python3dist-openapi-pydantic"

RDEPENDS:${PN} += "python-abi \
python314-pydantic"

inherit rpm
