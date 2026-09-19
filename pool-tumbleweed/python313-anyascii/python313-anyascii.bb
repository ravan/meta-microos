SUMMARY = "Unicode to ASCII transliteration"
DESCRIPTION = "Converts Unicode characters to their best ASCII representation."
LICENSE = "ISC"

PV = "0.3.3"

RPM_NAME = "python313-anyascii-0.3.3-1.5.noarch.rpm"
RPM_HASH = "cbe668ab54b4685c1117fd554dbaeef5196504fe18295cc42936f0a6b534a310cc113dbd8d60046281abb6c53ed8ef8381cdccb0653ca37e4a8ad73cfed17507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anyascii \
python3.13dist-anyascii \
python313-anyascii \
python3dist-anyascii"

RDEPENDS:${PN} += "python-abi"

inherit rpm
