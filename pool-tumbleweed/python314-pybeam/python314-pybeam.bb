SUMMARY = "Python module to parse Erlang BEAM files"
DESCRIPTION = "Python module to parse Erlang BEAM files, now it is able to read \
imports, exports, atoms, as well as compile info and attribute \
chunks in pretty python format."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python314-pybeam-0.8.1-1.5.noarch.rpm"
RPM_HASH = "69b17457d2eb7e69ff0d764ccbb858e50d28068b82dbc8cc28d2a37eada0c79ba15b50cae2ef9c8e3d0666363974742c93859fe4993271bc2e9aba442a6c1b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pybeam \
python314-pybeam \
python3dist-pybeam"

RDEPENDS:${PN} += "python-abi \
python314-construct"

inherit rpm
