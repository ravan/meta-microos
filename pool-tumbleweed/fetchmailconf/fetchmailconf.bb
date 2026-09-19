SUMMARY = "Fetchmail Configuration Utility"
DESCRIPTION = "A GUI configuration utility for generating fetchmail configuration \
files (.fetchmailrc)."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.1"

RPM_NAME = "fetchmailconf-6.6.1-3.3.aarch64.rpm"
RPM_HASH = "23a377917baa9b03d0a6d6c0ecfd9948371ecfadd75b60d619214bbf13ef1312c1d0db197f4766e420ea8cfde806fefb7f87fb36c46743969aa969510d42d50d"

RPROVIDES:${PN} += "fetchmailconf"

RDEPENDS:${PN} += "/usr/bin/sh \
fetchmail \
python-abi \
python3 \
python3-tk"

inherit rpm
