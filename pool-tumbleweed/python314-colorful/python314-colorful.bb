SUMMARY = "Terminal string styling done right, in Python"
DESCRIPTION = "colorful gives you control over terminal string styling in Python \
with an easy to use API."
LICENSE = "MIT"

PV = "0.5.8"

RPM_NAME = "python314-colorful-0.5.8-1.4.noarch.rpm"
RPM_HASH = "dc7baec05a6ed39a5a2760ad3bf239bf76ae36c87e3d3a3c326e9d32c8c64bec227e2d8cab80b2fbf74c1f55c7b872d954bfe4b0ee667d5cb2ac9094d2e5acbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-colorful \
python314-colorful \
python3dist-colorful"

RDEPENDS:${PN} += "python-abi"

inherit rpm
