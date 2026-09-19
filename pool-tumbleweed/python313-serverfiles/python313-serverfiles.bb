SUMMARY = "A utility to locally store files on a HTTP server"
DESCRIPTION = "A utility that accesses files on an HTTP server and stores them \
locally for reuse."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python313-serverfiles-0.3.1-2.5.noarch.rpm"
RPM_HASH = "0eb13669c3e7543adf4c846db6557084a2d29eba4ce5c7ee949b5f111b4649390eab1cad9268e7158bf3e7ca33c0fb7a9092b46457ee7db68991a764db82a192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-serverfiles \
python3.13dist-serverfiles \
python313-serverfiles \
python3dist-serverfiles"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
