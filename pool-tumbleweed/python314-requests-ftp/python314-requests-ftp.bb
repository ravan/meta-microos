SUMMARY = "FTP Transport Adapter for Requests"
DESCRIPTION = "Requests-FTP is an implementation of a very stupid FTP transport adapter for \
use with the `Requests` Python library. \
 \
This library is *not* intended to be an example of Transport Adapters best \
practices. This library was cowboyed together in about 4 hours of total work, \
has no tests, and relies on a few ugly hacks. Instead, it is intended as both \
a starting point for future development and an example for how to \
implement transport adapters."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python314-requests-ftp-0.3.1-4.5.noarch.rpm"
RPM_HASH = "4bdcbaa5e61e0e7dc718d296e078814ccdbda366f08e594f1f7c1f8aad356fa5c76016dfef6c02e66020b96ede4f88eb0ddd9d5284a2e196d10cf24645e4821f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-ftp \
python314-requests-ftp \
python3dist-requests-ftp"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
