SUMMARY = "Binary files of latexpand"
DESCRIPTION = "Binary files of latexpand"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn27025"

RPM_NAME = "texlive-latexpand-bin-2026.20260301.svn27025-120.4.aarch64.rpm"
RPM_HASH = "98dfb973a540e7f635548c54a01867d7733c0a2d402174f629ce40fc875cfefe586ed006ca06870cf08297877787bfaa30c01c55ba758e05942703509bcfe73d"

RPROVIDES:${PN} += "texlive-latexpand-bin"

RDEPENDS:${PN} += "texlive-latexpand"

inherit rpm
