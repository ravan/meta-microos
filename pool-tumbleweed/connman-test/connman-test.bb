SUMMARY = "Test and example scripts for connman"
DESCRIPTION = "Provides test and example scripts for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-test-1.42-2.16.aarch64.rpm"
RPM_HASH = "f26208d1c01e48f6d0ef892231d535820543aaaecfd92086fe1469f6278cfa9f15c8d4e6925df3143d28f2f76bbd0774b6f102549f488115a06e58036e97d12e"

RPROVIDES:${PN} += "connman-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
connman"

inherit rpm
