SUMMARY = "A library for extracting HTML content from RTF encapsulated HTML"
DESCRIPTION = "A library for extracting HTML content from RTF encapsulated HTML as commonly found in the exchange MSG email format."
LICENSE = "LGPL-3.0-or-later"

PV = "0.1.2.2"

RPM_NAME = "python314-RTFDE-0.1.2.2-1.2.noarch.rpm"
RPM_HASH = "e96ab7a32ac7476478b7d2104dc5fb8d19178da78c7249b2601cc4ac189b20186b6e8a09a7730f664ca539108b9453a81204e4f6b3e4545459f5d775705f246a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rtfde \
python314-RTFDE \
python3dist-rtfde"

RDEPENDS:${PN} += "python-abi \
python314-lark \
python314-oletools"

inherit rpm
