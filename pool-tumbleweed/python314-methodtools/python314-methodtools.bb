SUMMARY = "Expand Standard Functools to Methods"
DESCRIPTION = "Expand functools features to methods, classmethods, \
staticmethods and even for (unofficial) hybrid methods."
LICENSE = "BSD-2-Clause"

PV = "0.4.7"

RPM_NAME = "python314-methodtools-0.4.7-2.5.noarch.rpm"
RPM_HASH = "40882f07757ae40cac037e883841f79c97e620795f63cdccb1b70994001108cc324eeb7d0fb2182e59f6851a1c143755088fb7fb4386aef732f66d2c932de135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-methodtools \
python314-methodtools \
python3dist-methodtools"

RDEPENDS:${PN} += "python-abi \
python314-wirerope"

inherit rpm
