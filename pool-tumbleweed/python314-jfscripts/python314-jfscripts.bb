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

RPM_NAME = "python314-jfscripts-1.1.0-3.5.noarch.rpm"
RPM_HASH = "4b564039032155f198a56e50835ee5c36638bc9392b3b9cb578409ce25ca84232cbbaebc424d7e8dee10350ad40cbfb7a23d4a7f9d4258673744baaa88950dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jfscripts \
python314-jfscripts \
python3dist-jfscripts"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-termcolor \
python314-typing-extensions"

inherit rpm
