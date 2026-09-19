SUMMARY = "File type identification using libmagic"
DESCRIPTION = "This module uses ctypes to access the libmagic file type \
identification library. It makes use of the local magic database and \
supports both textual and MIME-type output."
LICENSE = "Python-2.0"

PV = "0.4.27"

RPM_NAME = "python314-python-magic-0.4.27-7.2.noarch.rpm"
RPM_HASH = "77be26e52a5ad396ca1c91713ebd77fd2f0dfa3ab609b133e3abaf98cfd3023255eb31150f8f2980489f889adb11902124f598ce84bb02e1ef6fc43e7feb514e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-magic \
python314-python-magic \
python3dist-python-magic"

RDEPENDS:${PN} += "file \
python-abi"

inherit rpm
