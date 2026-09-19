SUMMARY = "Standard library xdrlib redistribution. 'dead battery'"
DESCRIPTION = "Standard library xdrlib redistribution. 'dead battery'."
LICENSE = "Python-2.0"

PV = "3.13.0"

RPM_NAME = "python314-standard-xdrlib-3.13.0-1.5.noarch.rpm"
RPM_HASH = "d8b96e76ed089779357687f542641e42d44d5e3e60ccf60953b611043443710a45dbe527c3d89e396de4f21c0d119533fca241e658b80f5869c3ed99905ae67d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-standard-xdrlib \
python314-standard-xdrlib \
python3dist-standard-xdrlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
