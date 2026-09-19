SUMMARY = "DFU tool for updating Nitrokeys' firmware"
DESCRIPTION = "nkdfu is a Python DFU tool for updating Nitrokeys' firmware. Currently supports Nitrokey Pro only. \
Based on python-dfu project, which brings implementation of USB DFU 1.1 spec."
LICENSE = "GPL-2.0-only"

PV = "0.2"

RPM_NAME = "python314-nkdfu-0.2-2.1.noarch.rpm"
RPM_HASH = "2dbf1564f3f3abfc222ea916f9a4312ccabf2697e2ddadfc2411339ce196ebdc42a7058dcdadb406046cdfddf59834f053eeaff3e5afef6e56ee0101b7cd3a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nkdfu \
python314-nkdfu \
python3dist-nkdfu"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
intelhex \
python-abi \
python314-fire \
python314-libusb1 \
python314-tqdm \
update-alternatives"

inherit rpm
