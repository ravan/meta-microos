SUMMARY = "Project-oriented workflow in Python"
DESCRIPTION = "Project-oriented workflow in Python"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-pyprojroot-0.3.0-1.4.noarch.rpm"
RPM_HASH = "7616e599c5c1f4bdefb8896f1469ff52e06af4d5c4ff966fdee6d018a3439e532132d6feef343f4ac9448b64cb7a97104131646b8f1bc3bb31a8a10517934f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyprojroot \
python314-pyprojroot \
python3dist-pyprojroot"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
