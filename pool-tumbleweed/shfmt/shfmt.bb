SUMMARY = "A shell formatter with bash support"
DESCRIPTION = "A shell formatter. Supports POSIX Shell, Bash, and mksh."
LICENSE = "BSD-3-Clause"

PV = "3.12.0"

RPM_NAME = "shfmt-3.12.0-1.8.aarch64.rpm"
RPM_HASH = "33ea971ac8f4f484177235807a08cba36d6944e165b08bfc072a3e593e0b93afa02add16772820b998534d044815af63690629bc451c6e171e46542b0b011e17"

RPROVIDES:${PN} += "shfmt"

RDEPENDS:${PN} += ""

inherit rpm
