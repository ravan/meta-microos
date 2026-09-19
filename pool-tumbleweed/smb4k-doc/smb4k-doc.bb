SUMMARY = "Documentation for smb4k"
DESCRIPTION = "Smb4K is an advanced network neighborhood browser and Samba share mounting \
utility for the KDE Software Compilation. It scans your network neighborhood \
for all available workgroups, servers and shares and can mount all desired \
shares to your local file system. \
 \
This package provides the documentation for smb4k."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.6"

RPM_NAME = "smb4k-doc-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "2978efe336cacb576fce6ee3090ab0df644fb510071f90aa2b4da2bf560d675265bdda3f68e2e6ddbc07d932ab05cede5a2df019ac6e8b4e0943802017f317ed"

RPROVIDES:${PN} += "smb4k-doc"

RDEPENDS:${PN} += "smb4k"

inherit rpm
