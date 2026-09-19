SUMMARY = "File type identification using libmagic"
DESCRIPTION = "This module uses ctypes to access the libmagic file type \
identification library. It makes use of the local magic database and \
supports both textual and MIME-type output."
LICENSE = "Python-2.0"

PV = "0.4.27"

RPM_NAME = "python313-python-magic-0.4.27-7.2.noarch.rpm"
RPM_HASH = "d236d33d12226111759ece2f2cabe315092eca9b1a16a887ff17aa2fddf61d3e5cc3e6e6a4f7bc8f8c5170f3652709e493e264660ae8fb2db7c4e0e5dd18f616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-magic \
python3.13dist-python-magic \
python313-python-magic \
python3dist-python-magic"

RDEPENDS:${PN} += "file \
python-abi"

inherit rpm
