SUMMARY = "Linker scripts and device specs for PRU MCU variants"
DESCRIPTION = "This package contains the linker scripts, device specs and I/O headers for the \
different PRU variants in different TI SoCs. Install this package to allow the \
'-mmcu=' GCC compiler option to pick the correct settings for your board."
LICENSE = "BSD-2-Clause"

PV = "0.8.0"

RPM_NAME = "gnuprumcu-0.8.0-2.10.noarch.rpm"
RPM_HASH = "0c8d036a0a7ce357d7ca8b0b1aa67bda70f476d0f47f15a4546fcf3aa2a96a5592e1652d6c9477d2966b4a93353cbd8731c10ba8363c8d3bbb7b53b565646193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuprumcu"

RDEPENDS:${PN} += ""

inherit rpm
