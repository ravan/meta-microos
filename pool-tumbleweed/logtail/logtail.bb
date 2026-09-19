SUMMARY = "Helper application to analyze logfiles"
DESCRIPTION = "Print log file lines that have not been read"
LICENSE = "GPL-2.0-or-later"

PV = "0.2.4"

RPM_NAME = "logtail-0.2.4-21.11.aarch64.rpm"
RPM_HASH = "9facf7eac3b78b508c80c61e702a2379412bc1607ad59f5e61fcca5518fe22fe234de9081cbca1863a1d7726a9c20b15ad78f6f8b0f07f053573f76aa634ee0b"

RPROVIDES:${PN} += "logtail"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
