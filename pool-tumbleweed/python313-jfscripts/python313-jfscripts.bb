SUMMARY = "A collection of various tools written by Josef Friedrich"
DESCRIPTION = "A collection of various tools written by Josef Friedrich \
  * dns-ipv6-prefix.py \
  * extract-pdftext.py \
  * find-dupes-by-size.py \
  * list-files.py \
  * mac-to-eui64.py \
  * pdf-compress.py \
  * image-into-pdf.py"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-jfscripts-1.1.0-3.5.noarch.rpm"
RPM_HASH = "f3ad0a0c60997bd49d64a8620d2dd71ddc840a6ca065d9fef2d68aa975af8632d7d34563f0e9b9059e627aace8d60b93ba02074d602748b190b7ba72e571260a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jfscripts \
python3.13dist-jfscripts \
python313-jfscripts \
python3dist-jfscripts"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-termcolor \
python313-typing-extensions"

inherit rpm
