SUMMARY = "This tool lets you search your gadgets on your binaries to facilitate your ROP exploitation"
DESCRIPTION = "This tool lets you search your gadgets on your binaries to facilitate your ROP exploitation."
LICENSE = "BSD-3-Clause"

PV = "7.7"

RPM_NAME = "python313-ropgadget-7.7-3.2.noarch.rpm"
RPM_HASH = "cf4b5815b138c8cbea552ec5d7bc79dece1cfb487ff78107362034a6f00ea801f00f846cef08eb948f16a878cad4db21c0a1118c9a7b83d76343d1632ca14a18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ropgadget \
python3.13dist-ropgadget \
python313-ropgadget \
python3dist-ropgadget"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python3-capstone"

inherit rpm
