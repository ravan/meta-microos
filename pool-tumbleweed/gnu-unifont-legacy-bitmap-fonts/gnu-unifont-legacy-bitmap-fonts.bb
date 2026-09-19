SUMMARY = "The GNU Unicode Bitmap Font"
DESCRIPTION = "The GNU Unifont by Roman Czyborra is a free bitmap font that \
covers the Unicode Basic Multilingual Plane (BMP), using an \
intermediate bitmapped font format. \
 \
This package provides an old version of GNU unifont just for \
compatibility reasons."
LICENSE = "GPL-2.0+"

PV = "20080123"

RPM_NAME = "gnu-unifont-legacy-bitmap-fonts-20080123-1.25.noarch.rpm"
RPM_HASH = "05f4265a9b4fefd350e835b6495f6450b544c33d4ec6e69d432d97399f0165379f7b32f5b320e3980237fb8c3994f09753233e8bb2a2b36b3a299d7e2fc98148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-unifont \
gnu-unifont-legacy-bitmap-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
