SUMMARY = "Tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Tools to access the OLE 2 Compound File (OLECF) format. The OLE 2 \
Compound File format is used to store certain versions of Microsoft \
Office files, thumbs.db and other file formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libolecf-tools-20260526-1.12.aarch64.rpm"
RPM_HASH = "a964f3a903820754e40cb07b8666ec2c1e48c64fe51a7a2a6f9f45c4c32691d077280593638ca64de025081b42ae35406c5ab1348c935744014e5b3856422342"

RPROVIDES:${PN} += "libolecf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfole.so.1 \
libfuse3.so.4 \
libolecf.so.1 \
libolecf1 \
libuna.so.1"

inherit rpm
