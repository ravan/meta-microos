SUMMARY = "A module wrapper for os.path"
DESCRIPTION = "The path package implements a path objects as first-class \
entities, allowing common operations on files to be invoked \
on those path objects directly."
LICENSE = "MIT"

PV = "17.1.1"

RPM_NAME = "python314-path-17.1.1-1.5.noarch.rpm"
RPM_HASH = "fc113598793ae9ee75c3d8cf5e5ba7dbd74cbb4fa38b648e93ddc8c13e23d574ee3a657cfa1cf52bbc876aa818fe043624a58c1affc55c0e4e3a6465766a0586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-path \
python314-path \
python314-path.py \
python3dist-path"

RDEPENDS:${PN} += "python-abi"

inherit rpm
