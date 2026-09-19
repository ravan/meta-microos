SUMMARY = "Graphical file archiver"
DESCRIPTION = "PeaZip is a file and archive manager GUI for many formats. \
 \
Create: 7Z, ARC, BZ2, GZ, *PAQ, PEA, QUAD/BALZ, TAR, UPX, WIM, XZ, ZIP files \
 \
Extract 150+ archive types: ACE, ARJ, CAB, DMG, ISO, LHA, RAR, UDF, ZIPX and more \
 \
It can extract, create and convert multiple archives at once, \
create self-extracting archives, split/join files, supports strong encryption with two-factor authentication, \
has an encrypted password manager, secure deletion, can find duplicate files, calculate hashes, and \
export job definition as a script."
LICENSE = "LGPL-3.0-only"

PV = "11.2.0"

RPM_NAME = "peazip-11.2.0-2.1.aarch64.rpm"
RPM_HASH = "96fc60f917655b251791d7be4b8886bf0ca24b20f88b95613048286759000a9aa1cde42e5b38af652b808086d7747861c38cf34114d35ff1bffd8b210e1ba379"

RPROVIDES:${PN} += "peazip"

RDEPENDS:${PN} += "/usr/bin/sh \
libQt6Pas.so.6 \
libX11.so.6 \
libc.so.6 \
p7zip-full \
upx"

inherit rpm
