SUMMARY = "Kerberos5 Credential Cache Collection utilities"
DESCRIPTION = "Kerberos5 Credential Cache Collection utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "python314-CCColUtils-1.5-2.7.aarch64.rpm"
RPM_HASH = "df7286a3cfd080f106f6d413f284629db641bbfb0fb9c63c7957c19948ca880543e50d55a16f9586be06952849c3f078c43ba2661798231585a359b547d7285f"

RPROVIDES:${PN} += "python3.14dist-cccolutils \
python314-CCColUtils \
python3dist-cccolutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkrb5.so.3 \
python-abi"

inherit rpm
