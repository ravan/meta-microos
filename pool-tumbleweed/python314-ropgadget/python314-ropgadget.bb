SUMMARY = "This tool lets you search your gadgets on your binaries to facilitate your ROP exploitation"
DESCRIPTION = "This tool lets you search your gadgets on your binaries to facilitate your ROP exploitation."
LICENSE = "BSD-3-Clause"

PV = "7.7"

RPM_NAME = "python314-ropgadget-7.7-3.2.noarch.rpm"
RPM_HASH = "2b0389ca6c150d0d10f764882b2a55bf6bcb118354ff50597f33dfe43c97f8215ee5837e9487d93f8c688e005194a428fd48696670d632c98e741adeb9883735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ropgadget \
python314-ropgadget \
python3dist-ropgadget"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python3-capstone"

inherit rpm
