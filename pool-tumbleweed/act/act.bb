SUMMARY = "Run your GitHub Actions locally"
DESCRIPTION = "act helps you run your Github Actions locally."
LICENSE = "MIT"

PV = "0.2.84"

RPM_NAME = "act-0.2.84-1.6.aarch64.rpm"
RPM_HASH = "c5fb10aff637ed49775f230d027bacdb5f4e47c731cf119c09af60ae56ec1b0c1e4c6cb11ed9e5a311e82a8f4c5a24b4a4370433fc48ba381ab44a7a99cab45d"

RPROVIDES:${PN} += "act"

RDEPENDS:${PN} += ""

inherit rpm
