SUMMARY = "Desktop Backup Client based on BorgBackup"
DESCRIPTION = "Vorta is a backup client for Linux desktops. It integrates BorgBackup with \
the desktop environment to protect data from disk failure, \
ransomware and theft."
LICENSE = "Apache-2.0 & GPL-3.0-only & OFL-1.1"

PV = "0.11.5"

RPM_NAME = "vorta-0.11.5-1.2.noarch.rpm"
RPM_HASH = "91471cf3da8739e39e6e104ea57ba951e75a85e427041ed9fd130074b505de54bad34e5a398a388453ace966dbc07ab642fc8afc7bd7998bebb6030295a693c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-vorta \
python3dist-vorta \
vorta"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
borgbackup \
python-abi \
python313-PyQt6 \
python313-SecretStorage \
python313-peewee \
python313-platformdirs \
python313-psutil"

inherit rpm
