SUMMARY = "Markdown URL utilities"
DESCRIPTION = "A Python port of the JavaScript mdurl package. Formats and parses URLs in Markdown-Format."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-mdurl-0.1.2-2.14.noarch.rpm"
RPM_HASH = "d88226ccd80d06cb31f900c2fbd6833475996c7fbbd7e45e50cc1c060070f4599fd5d4fabd55bade1cb9745dfe3ed7b21dc3fe774bab59febc42a432a9c0b1ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mdurl \
python314-mdurl \
python3dist-mdurl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
