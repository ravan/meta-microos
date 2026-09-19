SUMMARY = "A module wrapper for os.path"
DESCRIPTION = "The path package implements a path objects as first-class \
entities, allowing common operations on files to be invoked \
on those path objects directly."
LICENSE = "MIT"

PV = "17.1.1"

RPM_NAME = "python313-path-17.1.1-1.5.noarch.rpm"
RPM_HASH = "5142358e2aafdec175602b90740abc0cdade3d22e43afc1abb55efa18d8c00d421c0c87b0c044c49f199211e7211a03e1ce3ec597e661fadd70ae8cd580299a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-path \
python3-path.py \
python3.13dist-path \
python313-path \
python313-path.py \
python3dist-path"

RDEPENDS:${PN} += "python-abi"

inherit rpm
