SUMMARY = "Development files for the procmeter system parameter display program"
DESCRIPTION = "With procmeter, one can display various system parameters, e.g. \
processor load, network load, etc. \
 \
This package provides files needed to build modules for procmeter."
LICENSE = "GPL-2.0-or-later"

PV = "3.6+svn415"

RPM_NAME = "procmeter-devel-3.6+svn415-3.11.aarch64.rpm"
RPM_HASH = "7b7db2a063fb9b743161043fcd559965a9ccba06abf6efc87277cccd25d679cb935b2614994c1d52ec28a8bd9f57dfe59c5df1b0756c7494edfe8f1b63af3896"

RPROVIDES:${PN} += "procmeter-devel"

RDEPENDS:${PN} += "procmeter"

inherit rpm
