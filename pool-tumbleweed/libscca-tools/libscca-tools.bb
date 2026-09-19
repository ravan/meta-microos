SUMMARY = "Tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca-tools is a project to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20260527"

RPM_NAME = "libscca-tools-20260527-1.11.aarch64.rpm"
RPM_HASH = "b6d07e4e046ba4c03f7883f4db75e3279b5b14089b9afd08d8abe8057c34e8b8ba39217d22976beb2eff8caf6bae8edf90a7b147767acded702be959510e9433"

RPROVIDES:${PN} += "libscca-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libscca.so.1 \
libuna.so.1"

inherit rpm
