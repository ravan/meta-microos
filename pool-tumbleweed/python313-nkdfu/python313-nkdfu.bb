SUMMARY = "DFU tool for updating Nitrokeys' firmware"
DESCRIPTION = "nkdfu is a Python DFU tool for updating Nitrokeys' firmware. Currently supports Nitrokey Pro only. \
Based on python-dfu project, which brings implementation of USB DFU 1.1 spec."
LICENSE = "GPL-2.0-only"

PV = "0.2"

RPM_NAME = "python313-nkdfu-0.2-2.1.noarch.rpm"
RPM_HASH = "7a999ddbaaea27a38d0d48539c705f39bed755b01ae015731687bd1308c42e1bc3201dd9394ded41e1cc05268032eba4468cc0d7ae8d9b96313ba28f9fc4a60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nkdfu \
python3.13dist-nkdfu \
python313-nkdfu \
python3dist-nkdfu"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
intelhex \
python-abi \
python313-fire \
python313-libusb1 \
python313-tqdm \
update-alternatives"

inherit rpm
