SUMMARY = "Pure Python decompression module for .Z files"
DESCRIPTION = "Pure Python decompression module for .Z files compressed using Unix \
compress utility. Unlike the faster but Linux-specific unlzw using \
Python CFFI, unlzw3 is slower but works on any platform that runs \
Python including Windows."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python314-unlzw3-0.2.3-1.4.noarch.rpm"
RPM_HASH = "0a48f375cd5df2dae9a7b34318817676be494ff472c41f070467447f414cbe138041817390d6b2210970e33d10216dbf55bd135057db7244ad2faa383a7c4fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-unlzw3 \
python314-unlzw3 \
python3dist-unlzw3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
