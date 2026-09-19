SUMMARY = "Python library to provide visual text-based progress to long running operations"
DESCRIPTION = "A Python Progressbar library to provide visual (yet text based) progress to long running operations."
LICENSE = "BSD-3-Clause"

PV = "4.5.0"

RPM_NAME = "python314-progressbar2-4.5.0-1.2.noarch.rpm"
RPM_HASH = "7542ac5646125ac62e693b7d5120f6da4184d70fb2515b606b9956070bbdad96562030974b71d48699bae88985271c696c82f037a35f4a1b18f546331a60a1cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-progressbar2 \
python314-progressbar2 \
python3dist-progressbar2"

RDEPENDS:${PN} += "python-abi \
python314-python-utils"

inherit rpm
