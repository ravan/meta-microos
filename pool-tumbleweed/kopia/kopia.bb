SUMMARY = "Cross-platform backup tool with fast incremental backups"
DESCRIPTION = "Kopia is a fast and secure open-source backup/restore tool that allows you to \
create encrypted snapshots of your data and save the snapshots to remote or \
cloud storage of your choice, to network-attached storage or server, or locally \
on your machine. Kopia does not 'image' your whole machine. Rather, Kopia \
allows you to backup/restore any and all files/directories that you deem are \
important or critical."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "kopia-0.23.1-1.4.aarch64.rpm"
RPM_HASH = "29957fdd33097779ae435cfa9fefb647cbd8a87d346e4fecd16d319474f128f103e78e2843975367b848444e49c106783ff2f9660e2f8b8230504cce4f207d9b"

RPROVIDES:${PN} += "kopia"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
