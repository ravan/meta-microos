SUMMARY = "Shells.com command line interface"
DESCRIPTION = "Command line tool for interacting with the Shells.com backend system."
LICENSE = "MIT"

PV = "0~20210507"

RPM_NAME = "shells-cli-0~20210507-1.26.aarch64.rpm"
RPM_HASH = "f3445063824b98847408e38322f9dc76806076adafe65aa173c8aaf0450c4e0ade10399d2844007254586af1c535a3add3d978c0db7ff21cca3152a6be23d417"

RPROVIDES:${PN} += "shells-cli"

RDEPENDS:${PN} += ""

inherit rpm
