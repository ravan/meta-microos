SUMMARY = "Multi volume file wrapper library"
DESCRIPTION = "A python library to provide a file-object wrapping multiple files as virtually like as \
a single file. It inherit io.RawIOBase class and support some of its standard methods."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.3"

RPM_NAME = "python314-multivolumefile-0.2.3-3.10.noarch.rpm"
RPM_HASH = "523099de37bfbed23a11189b797dc84b26b51b9f6e0fd6994e24f508a950a9e3d1b5d32d81e065eb01da3966e0fe038c9223dfc8b9bc9a5ed70225013ebe3cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-multivolumefile \
python314-multivolumefile \
python3dist-multivolumefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
