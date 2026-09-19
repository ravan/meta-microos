SUMMARY = "Kerberos5 Credential Cache Collection utilities"
DESCRIPTION = "Kerberos5 Credential Cache Collection utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "python313-CCColUtils-1.5-2.7.aarch64.rpm"
RPM_HASH = "1fed2542821601f264dc742d4df936c0839904e1e6f9c427cbf220fb0373f5e5c684dc03f99abbf9684bc061032ef59a53bb45a93021a1c98e7098ecad95c054"

RPROVIDES:${PN} += "python3-CCColUtils \
python3.13dist-cccolutils \
python313-CCColUtils \
python3dist-cccolutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkrb5.so.3 \
python-abi"

inherit rpm
