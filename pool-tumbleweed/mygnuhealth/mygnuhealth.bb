SUMMARY = "The personal health record for the GNU Health system"
DESCRIPTION = "The Personal Health Information Management System for Desktop and Mobile Devices \
for the GNU Health ecosystem"
LICENSE = "GPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "mygnuhealth-2.2.1-1.8.aarch64.rpm"
RPM_HASH = "58d9b526fa0ca250edd1a49bd23bef470806f2771609224eed7722ad5fc6ee334e3e2032daa08fd4485cc6783aa75ccdbb81da8c90e3a645f5f2c679f1023734"

RPROVIDES:${PN} += "mygnuhealth \
python3.13dist-mygnuhealth \
python3dist-mygnuhealth"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-CairoSVG \
python3-Kivy \
python3-bcrypt \
python3-bleak \
python3-dateutil \
python3-pygal \
python3-requests \
python3-tinydb"

inherit rpm
