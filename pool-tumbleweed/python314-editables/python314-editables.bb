SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python314-editables-0.6-1.2.noarch.rpm"
RPM_HASH = "8119a1d790c037d7f3dbbd04595a5bf4f638eefba5c0bc9f4a08d103fab1e85a6db82c8682399c3bfb108876e390fab41415cae8ddd4691b50da484cbce81148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-editables \
python314-editables \
python3dist-editables"

RDEPENDS:${PN} += "python-abi"

inherit rpm
