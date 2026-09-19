SUMMARY = "Create barcode image with GD"
DESCRIPTION = "GD::Barcode is a subclass of GD and allows you to create barcode image with \
GD. This module based on 'Generate Barcode Ver 1.02 By Shisei Hanai \
97/08/22'. \
 \
From 1.14, you can use this module even if no GD (except plot method)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.20.0"

RPM_NAME = "perl-GD-Barcode-2.20.0-1.5.noarch.rpm"
RPM_HASH = "c52e85d4c7e3abea097c05d01ad74c85f4bcf7d31ead810744f637e655ebdafa534ed865ea519467f28c7655de359cbfcacd3126a5ff8f6abc75c7a6fcd78a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GD--Barcode \
perl-GD--Barcode--COOP2of5 \
perl-GD--Barcode--Code39 \
perl-GD--Barcode--EAN13 \
perl-GD--Barcode--EAN8 \
perl-GD--Barcode--IATA2of5 \
perl-GD--Barcode--ITF \
perl-GD--Barcode--Industrial2of5 \
perl-GD--Barcode--Matrix2of5 \
perl-GD--Barcode--NW7 \
perl-GD--Barcode--QRcode \
perl-GD--Barcode--UPCA \
perl-GD--Barcode--UPCE \
perl-GD-Barcode"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
